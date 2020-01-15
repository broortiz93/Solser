package mx.solser.bpi.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "mx.solser.bpi"})
@EnableJpaRepositories( basePackages = "mx.solser.bpi")
//@EnableJpaRepositories(entityManagerFactoryRef = "informixEntityManagerFactory", transactionManagerRef = "informixTransactionManager", basePackages = {
//"com.spring.boot.inf.repository" })
public class AppConfig {

	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class, args);
	}

}
