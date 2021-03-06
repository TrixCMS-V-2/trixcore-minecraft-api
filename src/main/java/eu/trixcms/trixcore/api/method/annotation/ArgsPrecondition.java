package eu.trixcms.trixcore.api.method.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ArgsPrecondition {

    int amount() default 0;

    int min() default 0;

    int max() default 0;

}
