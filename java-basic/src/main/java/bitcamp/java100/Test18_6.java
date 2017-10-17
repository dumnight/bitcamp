//## String 클래스 사용법 - 정규식을 이용하여 문자열을 검사하기

package bitcamp.java100;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test18_6 {

    public static void main(String[] args) throws Exception {
        String email = "hong@test.com";
        
        //matches (정규표현식)
        System.out.println(email.matches("1hong@test.com"));
        // . 은 임의의 문자 한개
        // [+ 는 한 개 이상] [* 는 0개 이상] [? 는 0 또는 1개]
        // \  dot 문자
        System.out.println(email.matches(".+@.+\\..+"));
        // \d 숫자를 제외한 문자
        System.out.println(email.matches("^\\D.+@.+\\..+"));
        
        //java.util.regex.Pattern 클래스의 API 문서 참조
        
        System.out.println("-----------------------------------------");
        
        String str = "홍길동(hong@test.com),임꺽정(leem@test.com)," +
                    "유관순(yoo@test), 안중근(ahn@test.com),윤봉길(yoon@test.com)";
        
        // 해당 문자열에서 규칙을 갖는 문자열을 찾아 출력하기
        // 정규표현식 규칙을 생성한다.
        Pattern pattern = 
                Pattern.compile("\\w+@\\w+\\.\\w+");
        // 정규표현식 규칙에 따라 검사를 수행할 객체를 준비한다.
        Matcher matcher = pattern.matcher(str);
        
        // Matcher를 이용하여 규칙에 해당하는 문자열을 찾는다.
        int startIndex = 0;
        while (matcher.find()) {
            System.out.println(startIndex);
            String matchString = matcher.group();
            startIndex = matcher.end();
            
            System.out.println(matcher.group());
        }
               
    }
}


