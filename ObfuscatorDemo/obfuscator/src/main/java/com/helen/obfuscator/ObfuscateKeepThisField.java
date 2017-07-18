
package com.helen.obfuscator;

import java.lang.annotation.Inherited;

/**
 * 声明方法或者变量不要被混淆; 适用于类或者内部类.
 * <br /><br />
 * <p/>
 * 如果需要处理内部类, 在内部类上也需要加上相应的注释 ;
 * <br /><br />
 * <p/>
 * 用法:<br />
 * 1.首先在代码中加入注释<br />
 * 在不需要混淆的变量/方法前,加入ObfuscateKeepThisField注释;
 * <br />@ObfuscateKeepThisField<br />
 * test(){<br />
 * }
 * <p/>
 * <br />@ObfuscateKeepThisField<br />
 * int testValue = 0;<br />
 * <br />
 *
 * @author 菜刀文
 * @since 2015-1-8
 */

@Inherited
public @interface ObfuscateKeepThisField {

}
