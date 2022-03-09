package crm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.CrmConfig;
import crm.vo.Account;

public class CrmApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CrmConfig.class);
			
		//Account a = ctx.getBean(Account.class);
		
		Account a = (Account) ctx.getBean("getAccountFromContact");
		
		//Account commercialAccount = new Account();
		

	}
	
	

}
