package com.mycompany.address;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddressApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressApplication.class, args);
	}

	// Spring Data //
	// 01 - Adding Spring data starter.
	// 02 - Adding the required database.
	// 03 - Run the application to see that everything running fine.
	// 04 - Adding repository interface.
	// 05 - Adding @Entity and @Table annotation to the model.
	// 06 - Run the application to make sure it is still running fine.

}
