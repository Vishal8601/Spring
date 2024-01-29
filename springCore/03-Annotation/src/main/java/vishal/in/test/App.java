package vishal.in.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import vishal.in.Chip;
import vishal.in.Robot;
import vishal.in.Config.AppConfig;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Robot chip=ctx.getBean(Robot.class);
		chip.doWork();
		

	}

}
