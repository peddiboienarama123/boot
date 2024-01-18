package com.hospital.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = { "com.hospital.jpa.bean",
		"com.hospital.repository" })
@EnableTransactionManagement
public class JPAConfig {

}