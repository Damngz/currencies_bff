package com.currencies_bff.currencies_bff.restclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ClientRest", url = "http://localhost:8081")
public interface ClientRest {
	@GetMapping("/currencies")
  List<Object> getAllCurrencies();

  @GetMapping("/currencies/{id}")
  Object getCurrencyById(@PathVariable("id") Long id);

  @PostMapping("/currencies")
  Object createCurrency(@RequestBody Object currency);

  @GetMapping("/favorites/user/{userId}")
  List<Object> getFavoritesByUser(@PathVariable("userId") Long userId);

  @PostMapping("/favorites")
  Object addFavorite(@RequestBody Object favorite);

  @GetMapping("/users")
  List<Object> getAllUsers();

  @GetMapping("/users/{email}")
  Object getUserByEmail(@PathVariable("email") String email);
}
