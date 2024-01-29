package vishal.in.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Data
public class Person {
	
	private Integer personId;
	private String personName;
	private String gender;
	private long phone;
	private Date dob;

}
