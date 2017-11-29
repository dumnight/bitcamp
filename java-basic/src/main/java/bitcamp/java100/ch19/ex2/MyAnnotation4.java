package bitcamp.java100.ch19.ex2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) //.class파일에 저장되고 제거되지 않음 
public @interface MyAnnotation4 {}