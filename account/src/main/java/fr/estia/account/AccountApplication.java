package fr.estia.account;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class AccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(AccountRepository accountRepository) {
		return args -> {
			List<Account> accountList = List.of(
					Account.builder()
							// Do not set the id manually
							.balance(100D)
							.currencyType(CurrencyType.EUR)
							// Remove dateCreated if you want to rely on @CreationTimestamp
							.customerId(1L)
							.build(),
					Account.builder()
							// Do not set the id manually
							.balance(200D)
							.currencyType(CurrencyType.EUR)
							// Remove dateCreated if you want to rely on @CreationTimestamp
							.customerId(2L)
							.build()
			);
			accountRepository.saveAll(accountList);
		};
	}


}
