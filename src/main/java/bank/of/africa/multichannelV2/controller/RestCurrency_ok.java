package bank.of.africa.multichannelV2.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import bank.of.africa.multichannelV2.dao.ICurrency;
import bank.of.africa.multichannelV2.entite.Currency;


@RestController
public class RestCurrency_ok {

	
	@Autowired
    private EntityManager em;
	
	@Autowired	
	public ICurrency ic;
	
	
	@GetMapping("/currencies")
	Currency  getListCurrencies()  {
     
        
        Currency objCurrency = ic.findById("A1").orElse(null);
         
//        objCurrency.forEach(u -> System.out.println(u.toString()));
       return objCurrency; 
	}
}
