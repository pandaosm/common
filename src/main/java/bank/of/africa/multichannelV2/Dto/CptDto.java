package bank.of.africa.multichannelV2.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class CptDto {

	@JsonProperty("compte")
	private String compte;
	
	@JsonProperty("compte")
	private String client;
	
	@JsonProperty("ncg")
	private String ncg;

	@JsonProperty("ncggr")
	private String ncggr;
	
	@JsonProperty("ncggcat")
	private String ncggcat;

	@JsonProperty("tname")
	private String TNAME;
	
	@JsonProperty("model")
	private String model;
	
}
