package com.stock.service.YahooStock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class YahooStockApplication {

	public static void main(String[] args) {
		SpringApplication.run(YahooStockApplication.class, args);
	}

}
