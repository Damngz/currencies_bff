package com.currencies_bff.currencies_bff.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.currencies_bff.currencies_bff.restclients.ClientRest;
import com.currencies_bff.currencies_bff.services.BffService;

@Service
public class BffServiceImpl implements BffService {

	private final ClientRest clientRest;

	public BffServiceImpl(ClientRest clientRest) {

		this.clientRest = clientRest;
	}

  public List<Object> getAllCurrencies() {
    return clientRest.getAllCurrencies();
  }

  public Object getCurrencyById(Long id) {
    return clientRest.getCurrencyById(id);
  }

  public Object createCurrency(Object currency) {
    return clientRest.createCurrency(currency);
  }
  
  public List<Object> getFavoritesByUser(Long userId) {
    return clientRest.getFavoritesByUser(userId);
  }

  public Object addFavorite(Object favorite) {
    return clientRest.addFavorite(favorite);
  }
}
