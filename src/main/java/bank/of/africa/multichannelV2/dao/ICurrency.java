package bank.of.africa.multichannelV2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bank.of.africa.multichannelV2.entite.Currency;

public interface ICurrency  extends JpaRepository<Currency, String> {

}
