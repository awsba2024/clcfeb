package com.tcs.tth.iag.getflightlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;

import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class GetPaxListApplication {

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(GetPaxListApplication.class, args);

	}

}