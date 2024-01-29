package vishal.in.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
//this annotation used for convert java object to xml and xml to java object
@XmlRootElement
public class Book 
{
	private Integer id;
	private String name;
	private Double price;
}
