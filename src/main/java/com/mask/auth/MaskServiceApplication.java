package com.mask.auth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mask"})
@Slf4j
public class MaskServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MaskServiceApplication.class);
    }


    @PostConstruct
    public void inti() {
        log.debug("debug..............");
        log.info("info..................");
        log.error("error...................");
    }
}
