package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class SpringCloudNativeExApplicationTests {

	@Autowired
	WebTestClient webTestClient;
	@Test
	void whenGetGreetThenReturnMsg() {
		/*webTestClient
				.get()
				.uri("/greet")
				.exchange()
				.expectStatus().isOk()
				.expectBody(String.class).isEqualTo("Welcome to spring cloud native externalize configuration");*/

	}

}
