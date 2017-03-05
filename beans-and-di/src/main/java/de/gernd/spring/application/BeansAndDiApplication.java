package de.gernd.spring.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan({"de.gernd.spring.services", "de.gernd.spring.application"})
@SpringBootApplication
public class BeansAndDiApplication {

    public static void main(String[] args) {
        final ApplicationContext context = SpringApplication.run(BeansAndDiApplication.class, args);
        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.sort(beanNames);

        System.out.println("Bean names");
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
