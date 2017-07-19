# Obfuscator接入说明  


## 为什么需要Obfuscator   
发布APK的时候需要用proguard混淆, 但是配置混淆是一个痛苦的事.  
有些代码不能混淆时, 我们需要在配置中写keep配置, 过程很麻烦也容易出错.   

Obfuscator就是为了处理这个问题.    
给函数和类加上注解就能自动处理精细化的keep工作.  

现在支持:   

>1. 类中所有public成员不混淆(不包括内部类)    
2. 类中所有成员不混淆(不包括内部类)(内部类如果不需要混淆也要加入此注释)    
3. 保留所有实现IObfuscateKeepAll接口的类,(注意接口有传递性,他的子类也会被keep)(内部类如果没有继承此接口会被混淆)  
4. 保留带注释的成员,适用于类和内部类    
5. 保留类中set/get/is函数   


# 使用方法   

## 在build.gradle配置依赖

### 1.添加仓库和依赖

```java  
allprojects {
    repositories {
        ***  
         maven { url 'https://jitpack.io' }
    }
}

//工程的依赖里面添加
dependencies {
     compile 'com.github.helen-x:obfuscator:1.0'
   }

```   

#Obfuscator使用方法:


## 使用方法:

**场景1**:类中所有public成员不混淆(不包括内部类)  

```java   
@ObfuscateKeepPublic
public class TestAnnotationKeepPublic{
}
```

**场景2**:类中所有成员不混淆(不包括内部类)(内部类如果不需要混淆也要加入此注释)  

```java  
@ObfuscateKeepAll
public class TestAnnotationKeepAll {
}
```

**场景3**:保留所有实现IObfuscateKeepAll接口的类,(注意接口有传递性,他的子类也会被keep)(内部类如果没有继承此接口会被混淆)  

```java  
public class TestInterfaceKeep implements IObfuscateKeepAll{
}
``` 

**场景4**:保留带注释的成员,适用于类和内部类  

```java  
public class TestAnnotationKeepThisField {
    
    public String sName;
    public static String sSName;
    private int iValue;
    
    @ObfuscateKeepThisField
    private static int iSValue;
    
    @ObfuscateKeepThisField
    private void tFunc(){
    }
}
```  

**场景5**:保留类中set/get/is函数  

```java  
@ObfuscateKeepSetterGetter
public class TestAnnotationKeepSetterGetter {}
```  
----------
#2. 在proguard文件中加入ObfuscateHelper配置  


```java
#[Start-obfuscator 自定义混淆声明]  

#类中所有成员不混淆(不包括内部类)
#对应声明 ObfuscateKeepAll
-keep @com.helen.obfuscator.ObfuscateKeepAll class * { *; }

#类中所有public成员不混淆(不包括内部类)
#对应声明ObfuscateKeepPublic
-keep @com.helen.obfuscator.ObfuscateKeepPublic class * {   
  public <fields>;
  public <methods>;
}

#保留带注释的成员,适用于类和内部类
#对应声明ObfuscateKeepSetterGetter
-keepclassmembers class * {
@com.helen.obfuscator.ObfuscateKeepThisField * ;
}

#保留类中set/get/is函数
#对应声明ObfuscateKeepThisField
-keepclassmembers @com.helen.obfuscator.ObfuscateKeepSetterGetter class * {
    void set*(***);
    boolean is*(); 
    *** get*();
}
#保留所有实现IObfuscateKeepAll接口的类,(注意接口有传递性,他的子类也会被keep)(内部类如果没有继承此接口会被混淆)
#对应接口 IObfuscateKeepAll
-keep class * implements com.helen.obfuscator.IObfuscateKeepAll {
	*;
}
 #[end-obfuscator 自定义混淆声明]  
```
