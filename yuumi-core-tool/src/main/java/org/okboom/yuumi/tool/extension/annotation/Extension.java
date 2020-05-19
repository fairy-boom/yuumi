package org.okboom.yuumi.tool.extension.annotation;

import java.lang.annotation.*;

/**
 * @author tookbra
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Extension {

    String value() default "";
}
