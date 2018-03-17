package com.giscloud.registrycenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RegistryCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryCenterApplication.class, args);
	}
}
