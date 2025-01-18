package com.heeday.mvc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** <a href="https://curiousjinan.tistory.com/entry/spring-custom-annotation">커스텀 어노테이션</a>
* <a href="https://jake-seo-dev.tistory.com/67">@Retention</a> 어노테이션 메타정보가 언제 버려질지에 대한 타이밍을 설정함
* <a href="https://jangjjolkit.tistory.com/39">@Target</a>
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Controller {
    String value() default "";

    String path() default "";
}
