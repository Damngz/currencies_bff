package com.currencies_bff.currencies_bff.services.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.currencies_bff.currencies_bff.restclients.ClientRest;
import com.currencies_bff.currencies_bff.services.BffService;

@Service
public class BffServiceImpl implements BffService {

  @Autowired
	private ClientRest clientRest;

  public List<Object> getAllCurrencies() {
    return clientRest.getAllCurrencies();
  }

  public Object getCurrencyById(Long id) {
    return clientRest.getCurrencyById(id);
  }

  public Object createCurrency(Map<String, String> currency) {
    return clientRest.createCurrency(currency);
  }
  
  public List<Object> getFavoritesByUser(Long userId) {
    return clientRest.getFavoritesByUser(userId);
  }

  public Object addFavorite(Map<String, String> favorite) {
    return clientRest.addFavorite(favorite);
  }

  public List<Object> getAllUsers() {
    return clientRest.getAllUsers();
  }

  public Object getUserByEmail(String email) {
    return clientRest.getUserByEmail(email);
  }
}
