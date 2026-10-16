package com.softeq.app.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI api() {
        return new OpenAPI().info(apiEndPointsInfo());
    }

    private Info apiEndPointsInfo() {
        return new Info()
                .title("Spring Boot REST API")
                .description("Spring Boot REST API")
                .version("1.0.0");
    }

}
