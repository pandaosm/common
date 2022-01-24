package bank.of.africa.multichannelV2.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

 @Entity
 @Table(name="devises")
public class Currency {

	 @Id
	 @Column(name="iso")
	  private String iso;
	  
	 @Column(name="pays")
	  private String pays;
	  

	  private String nom;
	  

	  private String zone;

	
}
