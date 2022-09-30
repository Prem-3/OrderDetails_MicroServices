package com.spring.swagger.order.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerOrderConfig {
		@Bean
		public Docket productapi()
		{
		    return new Docket(DocumentationType.SWAGGER_2)
		            .select()
		            .apis(RequestHandlerSelectors.basePackage("com.spring.swagger.order.controller"))
		            .paths(regex("/rest.*"))
		            .build();
}
}
