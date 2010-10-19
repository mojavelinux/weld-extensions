package org.jboss.weld.extensions.core;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the bean name should be prepended with the package in which
 * the bean resides. Must be used in combination with &#164;Named on a bean
 * type, producer method or producer field.
 * 
 * @author Dan Allen
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Qualified
{
}
