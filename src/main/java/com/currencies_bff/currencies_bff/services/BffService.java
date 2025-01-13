package com.currencies_bff.currencies_bff.services;

import java.util.List;

public interface BffService {
	List<Object> getAllCurrencies();

  Object getCurrencyById(Long id);

  Object createCurrency(Object currency);

  List<Object> getFavoritesByUser(Long userId);

  Object addFavorite(Object favorite);
}
