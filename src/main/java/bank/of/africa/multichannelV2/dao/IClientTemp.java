package bank.of.africa.multichannelV2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import bank.of.africa.multichannelV2.entite.ClientTemp;

public interface IClientTemp extends JpaRepository<ClientTemp, String>{

	
}
