package vishal.in.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	@Id
	private Integer bookid;
	
	private String bookName;
	
	private Double bookPrice;

}
