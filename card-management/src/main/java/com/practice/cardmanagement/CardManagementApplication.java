package com.practice.cardmanagement;

import com.practice.cardmanagement.domain.dto.CardsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.eazybytes.cards.controller") })
@EnableJpaRepositories("com.eazybytes.cards.repository")
@EntityScan("com.eazybytes.cards.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Samim",
						email = "srsamim043@gmail.com",
						url = "url"
				),
				license = @License(
						name = "Apache 2.0",
						url = "url"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Cards microservice REST API Documentation",
				url = "url"
		)
)
public class CardManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardManagementApplication.class, args);
	}

}
