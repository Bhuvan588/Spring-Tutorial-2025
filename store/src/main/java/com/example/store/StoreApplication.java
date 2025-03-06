package com.example.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {


	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var orderservice = context.getBean(OrderService.class); //taking bean of orderService
		orderservice.placeOrder();


	}

}
