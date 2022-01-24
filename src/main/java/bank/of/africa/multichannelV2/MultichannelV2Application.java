package bank.of.africa.multichannelV2;

import java.util.List;
import java.util.stream.Stream;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import bank.of.africa.multichannelV2.dao.IClientTemp;
import bank.of.africa.multichannelV2.dao.ICurrency;
import bank.of.africa.multichannelV2.entite.ClientTemp;
import bank.of.africa.multichannelV2.entite.Currency;
import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class MultichannelV2Application implements CommandLineRunner{
	
	@Autowired	
	public ICurrency iCurrency;
	
	@Autowired	
	public IClientTemp iclttemp;
	
	public static void main(String[] args) {
		
		SpringApplication.run(MultichannelV2Application.class, args);
		System.out.println("***********Capital Connect Api************");
		System.out.println(buildChaine().toString());

	}
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		iCurrency.save(new Currency("A1","maroc","DH","nord Afriq"));
		iCurrency.save(new Currency("B2","senegal","XOF","Afrique"));
		
		iclttemp.save(new ClientTemp("A786764","I","100600","KENYA"));
		iclttemp.save(new ClientTemp("A786765","I","100700","TOGO"));
	List<ClientTemp> listClt = iclttemp.findAll();
	Stream<ClientTemp> strClt = listClt.stream();
	strClt.forEach(System.out::println);
			
	}
	
public static StringBuilder buildChaine()	
{
	String[] chaine = new String[]{"zzs","sfrg","eefr"};
	StringBuilder chaineF = new StringBuilder("A") ;

	for(int x=0 ; x<chaine.length;x++) {
		String chainAV=chaineF.substring(0, 1);
		String chaineAP= chaine[x].substring(0, 1);
			
		if(chaineAP.equals(chaineAP)) {
	
			chaineF=chaineF.delete(0,1);
			chaineF=chaineF.append(chaine);
		}
		
	}
	chaineF=chaineF.append("z");
	return chaineF;
}

}
