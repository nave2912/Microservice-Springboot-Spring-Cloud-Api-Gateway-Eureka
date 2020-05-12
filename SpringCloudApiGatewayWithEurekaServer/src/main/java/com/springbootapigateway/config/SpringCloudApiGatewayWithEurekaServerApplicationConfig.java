package com.springbootapigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.codec.ServerCodecConfigurer;

@Configuration
public class SpringCloudApiGatewayWithEurekaServerApplicationConfig {

	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(r-> r.path("/firstService/**").uri("http://localhost:8081").id("FirstService"))
				.build();
	}
	@Bean
	public ServerCodecConfigurer serverCodecConfigurer() {
	   return ServerCodecConfigurer.create();
	}
}
