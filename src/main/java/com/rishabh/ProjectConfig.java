package com.rishabh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Configuration class defined
public class ProjectConfig {
    @Bean // instructs spring to class this method when at context initialization and add the returned value to context
    Parrot parrot(){
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    String hello(){
        return "hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
