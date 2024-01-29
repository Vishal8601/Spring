package vishal.in.binding;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


public class JavaToJsonConvertor {

	public static void main(String[] args) throws IOException{
		
		
		Address address=new Address();
		address.setCity("Chandauli");
		address.setState("UtterPradesh");
		address.setCountry("India");
		Customer c=new Customer();
		c.setId(1);
		c.setName("Vishal singh");
		c.setGmail("vishal@gmail.com");
		c.setPhoneNo(8601246468L);
		c.setAddress(address);
	ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(new File ("customer.json"),c);
		System.out.println("Json File Created");

	}
}
