package bank.of.africa.multichannelV2.controller;

import java.util.List;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import bank.of.africa.multichannelV2.dao.IClientTemp;
import bank.of.africa.multichannelV2.entite.ClientTemp;



@RestController
public class RestClientTemp {

	
	@Autowired
    private IClientTemp icvt;
	
	@Autowired
	private EntityManager em;
	
	@GetMapping("/ClientTemp")
	ClientTemp  chaine()  {
     
        ClientTemp clientTemp = icvt.findById("A786764").orElse(null);
        
		/*
		 * listClientTemp.forEach(u -> System.out.println(u.getClientid()));
		 * Stream<ClientTemp> strCptViewTemp = listClientTemp.stream();
		 * strCptViewTemp.forEach(System.out::println);
		 */
        
		return clientTemp;
	}
}
