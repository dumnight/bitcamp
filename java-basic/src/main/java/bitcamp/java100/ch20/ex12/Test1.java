// Spring IoC(Inversion of Control) 컨테이너 - 의존 객체 주입 III
// 
package bitcamp.java100.ch20.ex12;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext appCtx = 
                new ClassPathXmlApplicationContext(
                        "bitcamp/java100/ch20/ex12/application-context1.xml");
        
        // 의존 객체가 없으면 객체 생성할 때 오류 발생
        Car car = (Car) appCtx.getBean("c1");
        System.out.println(car);
        
        System.out.println("---------------------------------------");
        String[] names = appCtx.getBeanDefinitionNames();
        for(String name : names) {
            System.out.println(appCtx.getBean(name));
        }
        
    }
}








