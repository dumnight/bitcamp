package java100.app.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//자동으로 객체를 생성해야 하는 클래스에 대해 붙인다
@Retention(RetentionPolicy.RUNTIME) //value 값을 지정할때 생략가능(value=RententionPolicy)
public @interface Component {
    // 객체를 생성한 후 빈 컨테이너에 저장할 때 사용할 이름
    String value() default "";
    
}
