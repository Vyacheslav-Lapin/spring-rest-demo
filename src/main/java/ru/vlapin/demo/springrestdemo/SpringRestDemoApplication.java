package ru.vlapin.demo.springrestdemo;

import static org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType.HAL;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.hateoas.config.EnableHypermediaSupport;

@EnableFeignClients
@SpringBootApplication
@ConfigurationPropertiesScan
@EnableHypermediaSupport(type = HAL)
@ComponentScan(includeFilters = @ComponentScan.Filter(Aspect.class))
public class SpringRestDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringRestDemoApplication.class, args);
  }
}
