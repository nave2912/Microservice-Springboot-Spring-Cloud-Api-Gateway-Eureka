package com.springbootapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudApiGatewayWithEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApiGatewayWithEurekaServerApplication.class, args);
	}

}
