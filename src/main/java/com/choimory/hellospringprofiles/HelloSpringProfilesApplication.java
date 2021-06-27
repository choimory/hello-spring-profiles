package com.choimory.hellospringprofiles;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class HelloSpringProfilesApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloSpringProfilesApplication.class, args);
    }

}
