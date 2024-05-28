package com.ramitax.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DocumentacionConfig {

    @Bean
    public OpenAPI customOpenAPI(@Value("V1") String AppVersion) {
        return new OpenAPI().info(new Info().title("API Sistema Gestion")
                .version(AppVersion)
                .description("Sistema Gestion")
                .termsOfService("http://google.com")
                .license(new License().name("Apache 2.0").url("https://www.apache.org/licenses/LICENSE-2.0")));

    }
}
