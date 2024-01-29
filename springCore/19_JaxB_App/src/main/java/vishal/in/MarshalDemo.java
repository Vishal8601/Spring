package vishal.in;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class MarshalDemo {
	public static void main(String[] args) throws Exception{
		Customer c=new Customer();
		c.setId(1);
		c.setName("Vishal singh");
		c.setGmail("vishal@gmail.com");
		c.setPhoneNo(8601246468L);
		JAXBContext n= JAXBContext.newInstance(Customer.class);
		Marshaller m = n.createMarshaller();
		m.marshal(c,new File ("custmer.xml"));
		System.out.println("Xml Created");
		
		}

}
