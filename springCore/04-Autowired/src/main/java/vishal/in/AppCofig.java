package vishal.in;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import vishal.in.Beans.Engine;

@Configuration
@ComponentScan
public class AppCofig {
	
	/*@Bean
	public Engine getEngine() {
		return new Engine();
		
	}*/
	/*
	 * @Bean is a Annotation here ioc container will not create object Engine class because 
	 * it is not a bean class its a normal java class 
	 * if we write @Bean it will work as bean class in run time 
	 * it will work as a reflection Api.
	 */

}
