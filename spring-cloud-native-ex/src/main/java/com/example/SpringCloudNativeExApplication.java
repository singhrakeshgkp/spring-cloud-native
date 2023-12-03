package com.example;

import java.beans.ConstructorProperties;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;


@SpringBootApplication
@ConfigurationPropertiesScan  // Tells the spring look in the class path for config prop beans
public class SpringCloudNativeExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudNativeExApplication.class, args);
	}

	@Bean
	RouterFunction<ServerResponse> routerFunction(){
		return  RouterFunctions.route()
				.GET("/",request -> ServerResponse.ok().bodyValue("Welcome to the world of spring cloud native (SCN)"))
				.GET("/customers",request -> ServerResponse.ok().bodyValue(
						List.of(
								new Customer("rakesh"),
								new Customer("devendra kumar"),
								new Customer("rakesh kumar singh")
						)
				)).build();
	}
}

record  Customer(String name){

}