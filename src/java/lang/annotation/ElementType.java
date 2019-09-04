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

package java.lang.annotation;

/**
 * The constants of this enumerated type provide a simple classification of the
 * syntactic locations where annotations may appear in a Java program. These
 * constants are used in {@link Target java.lang.annotation.Target}
 * meta-annotations to specify where it is legal to write annotations of a
 * given type.
 *
 * <p>The syntactic locations where annotations may appear are split into
 * <em>declaration contexts</em> , where annotations apply to declarations, and
 * <em>type contexts</em> , where annotations apply to types used in
 * declarations and expressions.
 *
 * <p>The constants {@link #ANNOTATION_TYPE} , {@link #CONSTRUCTOR} , {@link
 * #FIELD} , {@link #LOCAL_VARIABLE} , {@link #METHOD} , {@link #PACKAGE} ,
 * {@link #PARAMETER} , {@link #TYPE} , and {@link #TYPE_PARAMETER} correspond
 * to the declaration contexts in JLS 9.6.4.1.
 *
 * <p>For example, an annotation whose type is meta-annotated with
 * {@code @Target(ElementType.FIELD)} may only be written as a modifier for a
 * field declaration.
 *
 * <p>The constant {@link #TYPE_USE} corresponds to the 15 type contexts in JLS
 * 4.11, as well as to two declaration contexts: type declarations (including
 * annotation type declarations) and type parameter declarations.
 *
 * <p>For example, an annotation whose type is meta-annotated with
 * {@code @Target(ElementType.TYPE_USE)} may be written on the type of a field
 * (or within the type of the field, if it is a nested, parameterized, or array
 * type), and may also appear as a modifier for, say, a class declaration.
 *
 * <p>The {@code TYPE_USE} constant includes type declarations and type
 * parameter declarations as a convenience for designers of type checkers which
 * give semantics to annotation types. For example, if the annotation type
 * {@code NonNull} is meta-annotated with
 * {@code @Target(ElementType.TYPE_USE)}, then {@code @NonNull}
 * {@code class C {...}} could be treated by a type checker as indicating that
 * all variables of class {@code C} are non-null, while still allowing
 * variables of other classes to be non-null or not non-null based on whether
 * {@code @NonNull} appears at the variable's declaration.
 *
 * @author  Joshua Bloch
 * @since 1.5
 * @jls 9.6.4.1 @Target
 * @jls 4.1 The Kinds of Types and Values
 */
public enum ElementType {
    /**++
     * 用于描述类、接口（包括注解类型）、枚举的定义
     * Class, interface (including annotation type), or enum declaration
     */
    TYPE,

    /**
     * 成员变量、对象、属性（包括枚举常量）
     * Field declaration (includes enum constants)
     */
    FIELD,

    /**
     * 方法的定义
     * Method declaration
     */
    METHOD,

    /**
     * 参数的定义
     * Formal parameter declaration
     */
    PARAMETER,

    /**
     * 构造器的定义
     * Constructor declaration
     */
    CONSTRUCTOR,

    /**
     * 局部变量的定义
     * Local variable declaration
     */
    LOCAL_VARIABLE,

    /**
     * 注解的定义
     * Annotation type declaration
     */
    ANNOTATION_TYPE,

    /**
     * 包的定义
     * Package declaration
     */
    PACKAGE,

    /**
     * Type parameter declaration
     * 表示注解能写在类型变量的声明语句中
     *
     * @since 1.8
     */
    TYPE_PARAMETER,

    /**
     * 表示该注解能写在使用类型的任何语句中
     * Use of a type
     *
     * @since 1.8
     */
    TYPE_USE
}
