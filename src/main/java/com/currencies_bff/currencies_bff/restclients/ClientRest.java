package com.currencies_bff.currencies_bff.restclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ClienteRest", url = "http://localhost:8081/")
public interface ClientRest {
	@GetMapping("/currencies")
  List<Object> getAllCurrencies();

  @GetMapping("/currencies/{id}")
  Object getCurrencyById(@PathVariable Long id);

  @PostMapping("/currencies")
  Object createCurrency(@RequestBody Object currency);

  @GetMapping("/favorites/user/{userId}")
  List<Object> getFavoritesByUser(@PathVariable Long userId);

  @PostMapping("/favorites")
  Object addFavorite(@RequestBody Object favorite);
}
