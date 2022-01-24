package bank.of.africa.multichannelV2.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "cli")
public class ClientTemp {
	@Id
	@Column(name = "clientid")
	private String clientid;

	@Column(name = "typ")
	private String typ;

	@Column(name = "agenceid")
	private String agenceid;

	@Column(name = "nom")
	private String clientName;

	}
