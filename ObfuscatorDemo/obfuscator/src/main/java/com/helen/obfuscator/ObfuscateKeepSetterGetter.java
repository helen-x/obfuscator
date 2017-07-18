
package com.helen.obfuscator;

import java.lang.annotation.Inherited;


/**
 * 声明本类的set/get方法 不要被混淆
 *
 * 注意,这个不能自动处理内部类.
 *
 *
 * @author 菜刀文
 * @since 2015-1-8
 */

@Inherited
public @interface ObfuscateKeepSetterGetter {

}
