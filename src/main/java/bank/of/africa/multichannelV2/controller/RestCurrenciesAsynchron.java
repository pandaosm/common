package bank.of.africa.multichannelV2.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import bank.of.africa.multichannelV2.entite.Country;
import bank.of.africa.multichannelV2.entite.Currency;

@RestController
@RequestMapping("/Async")
public class RestCurrenciesAsynchron {

	@Autowired
	private RestTemplate restTemplate;
	

	@Async("asyncExecutor")
	public CompletableFuture<Country> completableCountry() throws InterruptedException{
		Country country = restTemplate.getForObject("http://localhost:8085/country2", Country.class);
		Thread.sleep(1000L); 
		return CompletableFuture.completedFuture(country);
	}
	

	@Async("asyncExecutor")
	public CompletableFuture<Currency> completableCurrency() throws InterruptedException{
		Currency currency = restTemplate.getForObject("http://localhost:8086/currencies", Currency.class);
		Thread.sleep(1000L); 
		return CompletableFuture.completedFuture(currency);
	}
	
	
	@GetMapping("/AsyncTotal")
	public void getAllEntities() {
			 
				try {
					long start = new Date().getTime();
					List<Country> country = (List<Country>) this.completableCountry();
					List<Currency> currency = (List<Currency>) this.completableCurrency();
					long fin = new Date().getTime();
					
					
					System.out.println("  debut  : " +start + "  fin : " + fin);
					
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
		
	}
}
