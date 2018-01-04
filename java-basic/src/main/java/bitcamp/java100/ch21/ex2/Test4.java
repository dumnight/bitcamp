// AOP(관점 지향 프로그래밍) 
// 
package bitcamp.java100.ch21.ex2;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test4 {

    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext appCtx = 
                new ClassPathXmlApplicationContext(
                        "bitcamp/java100/ch21/ex2/application-context4.xml");
        
        String[] names = appCtx.getBeanDefinitionNames();
        for(String name : names) {
            System.out.printf("%s => %s\n", name, appCtx.getBean(name).getClass().getName());
        }
        System.out.println("---------------------------------------");
        
        //AOP
        //기존의 코드를 손대지않고 기능을 삽입하는 기술 
        //메서드 호출 앞, 뒤로 코드를 삽입할 수 있다.
        //일종의 필터를 추가하는 기술이다.
        
        
        Front obj = (Front) appCtx.getBean(Front.class);
        obj.test();
        
        //작업 순서
        //1)Advice를 수행할 클래스를 만든다
        //2)XML 설정 파일에 코드 삽입 정보를 지정한다.
        
    }
}




















