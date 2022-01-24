package bank.of.africa.multichannelV2.entite;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country_view")
public class Country {

	@Id
	private String pays;

		private String nom;
		
		private String  iso;  
		
		private String  zone;

		public String getPays() {
			return pays;
		}

		public void setPays(String pays) {
			this.pays = pays;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getIso() {
			return iso;
		}

		public void setIso(String iso) {
			this.iso = iso;
		}

		public String getZone() {
			return zone;
		}

		public void setZone(String zone) {
			this.zone = zone;
		}

		public Country(String pays, String nom, String iso, String zone) {
			super();
			this.pays = pays;
			this.nom = nom;
			this.iso = iso;
			this.zone = zone;
		}

		public Country() {
			super();
		}
}

