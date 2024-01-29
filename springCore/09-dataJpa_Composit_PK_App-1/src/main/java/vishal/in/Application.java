package vishal.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import vishal.in.entity.Account;
import vishal.in.entity.AccountPk;
import vishal.in.repository.Accountrepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		Accountrepo bean = run.getBean(Accountrepo.class);
		
		AccountPk pk =new AccountPk();
		
		pk.setAccNumber( 31903560104l);
		pk.setAccType("Saving");
		
		Account ac=new Account();
		
		ac.setAccHolderName("Vishal Singh");
		ac.setBranch("Saiyadraja");
		ac.setAccPk(pk);
		bean.save(ac);
		System.out.println("Record Inserted...");
	}

}
