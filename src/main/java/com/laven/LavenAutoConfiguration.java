package com.laven;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnClass(Laven.class)
@EnableConfigurationProperties(LavenProperties.class)
@Configuration
public class LavenAutoConfiguration {
    @Bean
    Laven laven(LavenProperties lavenProperties) {
        return new Laven(lavenProperties);
    }
}
