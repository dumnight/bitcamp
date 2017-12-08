//: ## ver 48
//: - Spring IoC 컨테이너를 사용하여 객체 관리(Bean Container) 및 
//:   의존 객체 주입(DI)을 자동화하라!
//: - 학습목표
//:   - Spring IoC 컨테이너의 설정 및 사용방법을 익힌다.
//:   - Spring IoC 컨테이너의 역할을 이해한다.
//:   
package java100.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java100.app.util.DataSource;

@Configuration 
@ComponentScan("java100.app") 
public class AppConfig {
    @Bean 
    DataSource getDataSource() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/studydb");
        ds.setUsername("study");
        ds.setPassword("1111");
        return ds;
    }
}















