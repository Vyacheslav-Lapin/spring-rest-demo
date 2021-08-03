package ru.vlapin.demo.springrestdemo;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(includeFilters = @ComponentScan.Filter(Aspect.class))
public class SpringRestDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringRestDemoApplication.class, args);
  }
}
