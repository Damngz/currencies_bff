package com.currencies_bff.currencies_bff.services;

import java.util.List;
import java.util.Map;

public interface BffService {
	List<Object> getAllCurrencies();

  Object getCurrencyById(Long id);

  Object createCurrency(Map<String, String> currency);

  List<Object> getFavoritesByUser(Long userId);

  Object addFavorite(Map<String, String> favorite);

  List<Object> getAllUsers();

  Object getUserByEmail(String email);
}
