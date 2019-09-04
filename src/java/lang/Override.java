/*
 * Copyright (c) 2003, 2013, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package java.lang;

import java.lang.annotation.*;

/**++
 * 表示该方法定义为了覆盖在父类型中的定义，
 * 如果一个方法使用了这个注解则需要生成错误信息除非至少满足以下条件之一：
 * Indicates that a method declaration is intended to override a
 * method declaration in a supertype. If a method is annotated with
 * this annotation type compilers are required to generate an error
 * message unless at least one of the following conditions hold:
 *
 * <ul><li>
 * 这个方法会覆盖或实习在父类型中定义的方法
 * The method does override or implement a method declared in a
 * supertype.
 * </li><li>
 * 该方法的签名与对象中声明的任何公共方法的签名是等效的
 * https://stackoverflow.com/questions/16207386/what-is-override-equivalence-and-how-is-it-related-to-override
 * The method has a signature that is override-equivalent to that of
 * any public method declared in {@linkplain Object}.
 * </li></ul>
 *
 * @author  Peter von der Ah&eacute;
 * @author  Joshua Bloch
 * @jls 9.6.1.4 @Override
 * @since 1.5
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Override {
}
