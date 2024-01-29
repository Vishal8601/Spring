package vishal.in;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserDao implements InitializingBean,DisposableBean{
	
	
	public void getData() {
		System.out.println("Getting Data From DataBase....");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
	
		System.out.println("Created");
	}
	
	
}
