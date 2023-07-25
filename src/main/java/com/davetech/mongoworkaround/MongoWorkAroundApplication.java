package com.davetech.mongoworkaround;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
//@EnableSwagger2
@EnableWebMvc
//@EnableSwagger2WebMvc
public class MongoWorkAroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoWorkAroundApplication.class, args);
    }

}
