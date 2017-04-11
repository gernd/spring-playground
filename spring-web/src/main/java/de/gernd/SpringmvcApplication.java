package de.gernd;

import de.gernd.controller.ThymeleafController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class SpringmvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmvcApplication.class, args);
	}
}
