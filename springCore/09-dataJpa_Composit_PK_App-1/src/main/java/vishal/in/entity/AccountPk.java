package vishal.in.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AccountPk 
{

	private Long accNumber;
	
	private String accType;


}
