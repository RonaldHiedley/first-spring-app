package com.hiedley.first_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication // ess configuração compoem das três a seguir.
//@Configuration// Vai definir que nossa classe podem ter metódos que definem bin...
//@EnableAutoConfiguration// É uma classe que vai ativar a auto configuração do Spring.
//@ComponentScan// Permite que o Sprig escaneie todo o pacote de nosso projeto. Em busca dos componentes, das classes de configuração, classes de services dos controladores espalhados. Para que ele faça todo o gerenciamento de depencia dessas classes. O Spring vai fazer toda injeção de dependecias das nossas classes e todo gerenciamento do ciclo de vida dos componentes.
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
	}

}
