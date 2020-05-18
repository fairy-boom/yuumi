package org.okboom.yuumi.tool.extension.annotation;

import java.lang.annotation.*;

/**
 * @author tookbra
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface YuumiSPI {

    String value() default "";
}
