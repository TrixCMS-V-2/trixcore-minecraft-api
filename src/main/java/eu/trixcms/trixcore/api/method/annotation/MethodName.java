package eu.trixcms.trixcore.api.method.annotation;

import eu.trixcms.trixcore.api.method.Methods;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value= ElementType.TYPE_USE)
public @interface MethodName {

    String name() default "none";

    Methods method() default Methods.NONE;

}
