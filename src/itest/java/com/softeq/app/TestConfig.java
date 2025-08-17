package com.softeq.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.softeq.app"})
@EntityScan(basePackages = {"com.softeq.app.domain"})
@EnableJpaRepositories(basePackages = {"com.softeq.app.domain"})
public class TestConfig {
}
