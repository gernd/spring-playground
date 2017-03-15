package de.gernd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataSourceConfig {

    @Bean(name="dataSource")
    @Profile("development")
    public String getDevDataSource(){
        return "localhost";
    }

    @Bean(name="dataSource")
    @Profile("prod")
    public String getProdDataSource(){
        return "cloud environment vars";
    }
}
