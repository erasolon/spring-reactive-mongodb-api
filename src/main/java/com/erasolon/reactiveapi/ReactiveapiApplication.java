package com.erasolon.reactiveapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:Beans.xml"})
public class ReactiveapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactiveapiApplication.class, args);
    }

}
