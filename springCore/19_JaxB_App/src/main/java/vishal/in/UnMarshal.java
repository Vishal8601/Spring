package vishal.in;

import java.io.File;

import javax.xml.bind.JAXBContext;

import javax.xml.bind.Unmarshaller;

public class UnMarshal {
	public static void main(String[] args) throws Exception {
		File f=new File("custmer.xml");
		JAXBContext c=JAXBContext.newInstance(Customer.class);
		Unmarshaller un = c.createUnmarshaller();
		Object unmarshal = un.unmarshal(f);
		Customer ch=(Customer)unmarshal;
		System.out.println(ch);
	}

}
