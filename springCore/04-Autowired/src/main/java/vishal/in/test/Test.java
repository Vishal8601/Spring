package vishal.in.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import vishal.in.AppCofig;
import vishal.in.Beans.ReportService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext c=new AnnotationConfigApplicationContext(AppCofig.class);
		ReportService rs=c.getBean(ReportService.class);
		rs.generateReport();
		
	}
}
