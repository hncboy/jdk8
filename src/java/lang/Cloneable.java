/*
 * Copyright (c) 1995, 2004, Oracle and/or its affiliates. All rights reserved.
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

/**++
 * 标记接口
 * 一个类实现了 Cloneable 接口表明 使用 clone() 方法去复制一个实例是合法的
 * A class implements the <code>Cloneable</code> interface to
 * indicate to the {@link java.lang.Object#clone()} method that it
 * is legal for that method to make a
 * field-for-field copy of instances of that class.
 * <p>
 * 如果调用的 clone 方法的实例未实现 Cloneable 接口，会抛出 CloneNotSupportedException 异常
 * Invoking Object's clone method on an instance that does not implement the
 * <code>Cloneable</code> interface results in the exception
 * <code>CloneNotSupportedException</code> being thrown.
 * <p>
 * 按照惯例，类实现这个接口的化就应该重写 clone 这个方法，该方法用 public 修饰，
 * 在 Object 类中，clone 方法为 protected 修饰。
 * 有关更多的信息，参考 Object 中的 clone 方法。
 * By convention, classes that implement this interface should override
 * <tt>Object.clone</tt> (which is protected) with a public method.
 * See {@link java.lang.Object#clone()} for details on overriding this
 * method.
 * <p>
 * 注意该接口不包含 clone 方法，因此，仅仅实现该接口来 clone 对象是不可能的，即使用
 * 反射的方式调用该接口，也不能保证会成功。
 * Note that this interface does <i>not</i> contain the <tt>clone</tt> method.
 * Therefore, it is not possible to clone an object merely by virtue of the
 * fact that it implements this interface.  Even if the clone method is invoked
 * reflectively, there is no guarantee that it will succeed.
 *
 * @author  unascribed
 * @see     java.lang.CloneNotSupportedException
 * @see     java.lang.Object#clone()
 * @since   JDK1.0
 */
public interface Cloneable {
}
