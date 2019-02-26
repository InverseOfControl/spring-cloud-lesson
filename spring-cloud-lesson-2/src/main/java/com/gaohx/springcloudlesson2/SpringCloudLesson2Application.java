package com.gaohx.springcloudlesson2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.context.support.StandardServletEnvironment;

@SpringBootApplication
public class SpringCloudLesson2Application {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringCloudLesson2Application.class);
        application.setEnvironment(null);
        application.run(args);
    }
}
