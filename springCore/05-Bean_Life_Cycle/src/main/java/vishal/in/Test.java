package vishal.in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("Beans.xml");
		UserDao u=c.getBean(UserDao.class);
		u.getData();
	ConfigurableApplicationContext c2=(ConfigurableApplicationContext)c;
		c2.close(); //Xml Approach here we call ConfigurableApplicationContext interface
		
		
		
	}

}
