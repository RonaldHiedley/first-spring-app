package com.hiedley.first_spring_app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

import java.math.BigDecimal;

@SpringBootTest
@Profile("dev")
class FirstSpringAppApplicationTests {

	private BigDecimal meuSalarioDeProgramador = new BigDecimal( "10.00");

	@Test
	void contextLoads() {
		System.out.println("start on debug:");
		System.out.println("o salario é: " + meuSalarioDeProgramador);
		System.out.println("end.");
	}

}
