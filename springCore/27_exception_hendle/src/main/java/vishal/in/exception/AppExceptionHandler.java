package vishal.in.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {
	private Logger loger=LoggerFactory.getLogger(AppExceptionHandler.class);
	@ExceptionHandler(value=Exception.class)
	public String handleAR(Exception ae)
	{
		String msg = ae.getMessage();
		loger.error(msg);
		return "errorpage";
	}
}