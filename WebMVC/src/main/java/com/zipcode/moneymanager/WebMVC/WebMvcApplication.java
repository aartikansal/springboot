package com.zipcode.moneymanager.WebMVC;

import java.sql.Connection;
import java.util.List;


//@SpringBootApplication
public class WebMvcApplication {

	/*public static void main(String[] args) {
		SpringApplication.run(WebMvcApplication.class, args);
	}*/

	public static void main(String[] args) {
		System.out.println("Calling getConnection()...1");
		Connection connection = ConnectionFactory.getConnection();
		System.out.println("Calling getConnection()...2");
		Account account = new Account(connection);
		AccountData actual = account.findByID(1);
		System.out.println("Calling getConnection()...3");
		System.out.println("Getting from DB, Name is -->"+actual.getName());
		System.out.println("Getting from DB, Email is -->"+actual.getEmail());
		System.out.println("Getting from DB, Type of account  is -->"+actual.getTypeAccount());
		System.out.println("Getting from DB, Account Number is -->"+actual.getAccountNumber());

		List<AccountData> accountData1 = account.findAll();

		for (AccountData accData : accountData1) {
			//System.out.println(accountData1.toString());
			System.out.println("In the loop .... ");
			System.out.println("Getting from DB, Name is -->"+accData.getName());
			System.out.println("Getting from DB, Email is -->"+accData.getEmail());
			System.out.println("Getting from DB, Type of account  is -->"+accData.getTypeAccount());
			System.out.println("Getting from DB, Account Number is -->"+accData.getAccountNumber());
		}

		System.out.println("-----------------------------------------------------------");

		/*AccountData accData = new AccountData(12, "Ankit", "ankit@gmail1.com", 9345, "Regular");

		account.create(accData);

		actual = account.findByID(12);
		System.out.println(" ***** Newly Created Account using create method ***** ");
		System.out.println("Getting from DB, Name is -->"+actual.getName());
		System.out.println("Getting from DB, Email is -->"+actual.getEmail());
		System.out.println("Getting from DB, Type of account  is -->"+actual.getTypeAccount());
		System.out.println("Getting from DB, Account Number is -->"+actual.getAccountNumber());


		System.out.println("-----------------------------------------------------------");*/

		actual = account.findByID(12);
		actual.setName("Vince");
		account.update(actual);

		actual = account.findByID(12);
		System.out.println("**** After update method call **** ");
		System.out.println("Getting from DB, Name is -->"+actual.getName());
		System.out.println("Getting from DB, Email is -->"+actual.getEmail());

		System.out.println("-----------------------------------------------------------");

	}

}
