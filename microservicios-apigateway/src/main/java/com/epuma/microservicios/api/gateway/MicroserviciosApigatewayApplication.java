package com.epuma.microservicios.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviciosApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosApigatewayApplication.class, args);
	}

}
