package com.ericsson.java.app.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.ericsson.java.app.repository")
@EntityScan(basePackages = "com.ericsson.java.app.domain")
@EnableTransactionManagement
public class DataSourceConfig {
}
