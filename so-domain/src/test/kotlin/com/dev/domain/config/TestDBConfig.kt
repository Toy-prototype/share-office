package com.dev.domain.config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@EnableTransactionManagement
@Configuration
@EnableJpaRepositories(basePackages = ["com.dev"])
@EntityScan(basePackages = ["com.dev"])
@SpringBootApplication
class TestDBConfig {
}