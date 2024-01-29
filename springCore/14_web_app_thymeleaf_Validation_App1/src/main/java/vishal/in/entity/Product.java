package vishal.in.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data

public class Product {
	@Id
	@GeneratedValue
	private Integer id;
	@NotBlank(message = "Name Is Mandatory")
	@Size(min=3,max=15, message="Name Should Have Only 3 To 15 Character")
	private String name;
	@NotNull(message = "Price Is Mandatory")
	@Positive(message ="Price Should Be Positive Number")
	private Double price;
	@NotNull(message="Product Is Mandatory")
	@Positive(message ="Quantity Should Be Positive Number")
	private Integer qty;

}
