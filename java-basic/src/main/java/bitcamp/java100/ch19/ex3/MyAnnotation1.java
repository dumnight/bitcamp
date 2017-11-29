package bitcamp.java100.ch19.ex3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//에노테이션 프로퍼티 정의하기

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation1 {
    //프로퍼티를 선언할 때는 메서드 처럼 선언한다
    String name();
    int age();
}