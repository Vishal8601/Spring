package vishal.in.exception_handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionH {

	public Logger logger=LoggerFactory.getLogger(Exception.class);
	
	
	@ExceptionHandler(value=Exception.class)
	public String handleError(Exception ae) {
		String msg= ae.getMessage();
		logger.error(msg);
		return "errorPage";
		
	}
}
