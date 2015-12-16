package com.perficient.test.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class SpringConfigClientDemoApplication {

	@Value("${greeting}")
	private String greeting;
	
	@RequestMapping("/")
    public String home() {
        return greeting;
    }
	
    public static void main(String[] args) {
        SpringApplication.run(SpringConfigClientDemoApplication.class, args);
    }
}
