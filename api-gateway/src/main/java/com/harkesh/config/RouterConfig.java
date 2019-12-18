package com.harkesh.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouterConfig {

	@Bean
	public RouteLocator getwayRoutes(RouteLocatorBuilder builder) {
		
		return  builder.routes()
				 .route(p -> p
	                        .path("/all")
	                        .filters(f ->
	                                f.addRequestHeader("x-rapidapi-host", "restcountries-v1.p.rapidapi.com")
	                                        .addRequestHeader("x-rapidapi-key", "1cfbdceb89msh5ae0c25f8a27b7ap17353djsn03ed743b1d4f")
	                                        
	                        )
	                        .uri("https://restcountries-v1.p.rapidapi.com")
	                )
	                .route(p -> p
	                        .path("/v1/joke")
	                        .filters(f ->
	                                f.addRequestHeader("x-rapidapi-host", "joke3.p.rapidapi.com")
	                                        .addRequestHeader("x-rapidapi-key", "1cfbdceb89msh5ae0c25f8a27b7ap17353djsn03ed743b1d4f")
	                                        
	                        )
	                        .uri("https://joke3.p.rapidapi.com")
	                )
	                .route(p -> p
	                        .path("/message")
	                        
	                        .uri("http://localhost:8081/")
	                        .id("employeeModule")
	                )
	                .route(p -> p
	                        .path("/v1")
	                        
	                        .uri("http://localhost:8081/")
	                        .id("employeeModule")
	                )
	                .route(p -> p
	                        .path("/hello")
	                        
	                        .uri("http://localhost:8081/")
	                        .id("employeeModule")
	                )
	                .build();
	}

}
