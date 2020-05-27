package cn.sm.com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.sm.com.mapper")
public class Application_8080 {
    public static void main(String[] args) {
        SpringApplication.run(Application_8080.class, args);
    }
}
