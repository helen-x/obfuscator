
package com.helen.obfuscator;
import java.lang.annotation.Inherited;

/**
 * 声明本类的public方法/变量 不要被混淆
 *
 * 注意,这个不能自动处理内部类.
 * 
 * 如果需要处理内部类, 在内部类上也需要加上相应的注释
 *
 * @author 菜刀文
 * @since 2015-1-8
 */

// 用法:(假如Test.java不要混淆)
// 1.在Test.java类前面加上 注释@ObfuscateKeepPublic
// 2.在混淆配置文件中 proguard-project.txt 中加入
// #自定义混淆声明 "com.obfuscate.helper.ObfuscateKeepPublic class"
//-keep @com.obfuscate.helper.ObfuscateKeepPublic class * {
//
// public <fields>;
// public <methods>;
//}

@Inherited
public @interface ObfuscateKeepPublic {
}
