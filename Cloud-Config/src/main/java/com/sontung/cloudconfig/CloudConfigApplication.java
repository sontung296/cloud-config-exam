package com.sontung.cloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CloudConfigApplication.class, args);
//
//        TestService testService = context.getBean(TestService.class);
//
//        testService.printTest();

    }

}
