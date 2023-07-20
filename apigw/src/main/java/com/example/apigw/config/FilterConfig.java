package com.example.apigw.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class FilterConfig {
//    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/first-service/**")
                        .filters(f -> f.addRequestHeader("req-header","first-req")
                                .addResponseHeader("res-header","first-res"))
                        .uri("http://127.0.0.1:8081/"))
                .route(r -> r.path("/second-service/**")
                        .filters(f -> f.addRequestHeader("req-header","second-req")
                                .addResponseHeader("res-header","second-res"))
                        .uri("http://127.0.0.1:8082/"))
                .build();
    }
}
