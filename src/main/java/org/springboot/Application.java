package org.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Created by 76164 on 2017/10/11.
 */
@MapperScan("org.springboot.dao")
@SpringBootApplication
public class Application {
    public static void  main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
