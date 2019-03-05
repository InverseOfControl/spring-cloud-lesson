package com.gaohx.springcloudlesson3configclient;

import com.gaohx.springcloudlesson3configclient.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(User.class)
public class SpringCloudLesson3ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudLesson3ConfigClientApplication.class, args);
    }

}
