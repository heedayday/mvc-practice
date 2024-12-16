package com.heeday.mvc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*커스텀 어노테이션 https://velog.io/@potato_song/Java-%EC%96%B4%EB%85%B8%ED%85%8C%EC%9D%B4%EC%85%98-%EC%BB%A4%EC%8A%A4%ED%85%80-%EC%96%B4%EB%85%B8%ED%85%8C%EC%9D%B4%EC%85%98-%EB%A7%8C%EB%93%A4%EA%B8%B0
   @Retention 어노테이션 메타정보가 언제 버려질지에 대한 타이밍을 설정함 https://jake-seo-dev.tistory.com/67
@Target https://jangjjolkit.tistory.com/39 https://curiousjinan.tistory.com/entry/spring-custom-annotation*/

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Controller {
    String value() default "";

    String path() default "";
}
