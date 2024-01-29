package vishal.in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con= new ClassPathXmlApplicationContext("Beans.xml");
		PaymentService service=con.getBean(PaymentService.class);
		service.doPayment(1000.00);
	}

}
