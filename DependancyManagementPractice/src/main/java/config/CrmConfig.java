package config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import crm.vo.Account;
import crm.vo.Contact;

@SpringBootApplication   //...
public class CrmConfig {

	@Bean
	public Account getAccount() {
		System.out.println("getting a new account");
		return new Account();
		
	}
	
	//default bean name is method name
	@Bean ("getAccountFromContact")
	public Account getAccountFromContact() {
		System.out.println("getting a new Account from Contact");
		Contact c = new Contact();
		return c.getA();
	}
}
