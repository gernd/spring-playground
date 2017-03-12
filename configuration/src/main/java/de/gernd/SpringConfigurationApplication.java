package de.gernd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringConfigurationApplication {

    public static void main(String[] args) {
        final ApplicationContext applicationContext = SpringApplication.run(SpringConfigurationApplication.class, args);

        String[] beanNames = applicationContext.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

        MyBean myBean = (MyBean) applicationContext.getBean("myBean");
        myBean.printConfig();
    }
}
