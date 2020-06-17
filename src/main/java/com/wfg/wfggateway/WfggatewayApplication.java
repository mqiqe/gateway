package com.wfg.wfggateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@EnableDiscoveryClient
@EnableAutoConfiguration
@SpringBootApplication
public class WfggatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(WfggatewayApplication.class, args);
	}

	@LoadBalanced
	@Bean
	public RestTemplate loadbalancedRestTemplate() {
		return new RestTemplate();
	}

	@RefreshScope
	@RestController
	class TestController {

		@Value("${message}")
		private String message;

		@GetMapping("/health")
		public String health() {
			return message;
		}

	}

}
