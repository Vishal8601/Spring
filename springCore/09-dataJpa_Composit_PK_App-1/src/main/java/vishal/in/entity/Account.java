package vishal.in.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Account
{
		
	private String accHolderName;
	
	private String  branch;
	
	@EmbeddedId
	private AccountPk accPk;
	
	@CreationTimestamp
	@Column(name="dateCreated", updatable = false)
	private LocalDate dateCreated;
	
	@UpdateTimestamp
	@Column(name="lastUpdate",insertable = false)
	private LocalDate lastUpdate;
}
