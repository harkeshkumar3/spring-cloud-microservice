package com.harkesh.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouterConfig {

	@Bean
	public RouteLocator getwayRoutes(RouteLocatorBuilder builder) {

		return builder.routes().route(p -> p.path("/oauth/token").uri("http://localhost:9000").id("oauth"))
				.route(p -> p.path("/message").uri("http://localhost:8081/").id("employeeModule"))
				.route(p -> p.path("/v1").uri("http://localhost:8081/").id("employeeModule"))
				.route(p -> p.path("/hello").uri("http://localhost:8081/").id("employeeModule")).build();
	}

}
