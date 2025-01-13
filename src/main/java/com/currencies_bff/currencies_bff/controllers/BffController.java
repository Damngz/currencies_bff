package com.currencies_bff.currencies_bff.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.currencies_bff.currencies_bff.services.BffService;

@RestController
@CrossOrigin
@RequestMapping("/bff")
public class BffController {

  @Autowired
	private BffService bffService;

  @GetMapping
  public ResponseEntity<?> get() {
    return ResponseEntity.ok(bffService.getAllCurrencies());
  }

  @GetMapping("/currencies")
  public ResponseEntity<?> getAllCurrencies() {
    return ResponseEntity.ok(bffService.getAllCurrencies());
  }

  @GetMapping("/currencies/{id}")
  public ResponseEntity<?> getCurrencyById(@PathVariable Long id) {
    return ResponseEntity.ok(bffService.getCurrencyById(id));
  }

  @PostMapping("/currencies")
  public ResponseEntity<?> createCurrency(@RequestBody Map<String, String> currency) {
    return ResponseEntity.ok(bffService.createCurrency(currency));
  }

  @GetMapping("/favorites/user/{userId}")
  public ResponseEntity<?> getFavoritesByUser(@PathVariable Long userId) {
    return ResponseEntity.ok(bffService.getFavoritesByUser(userId));
  }

  @PostMapping("/favorites")
  public ResponseEntity<?> addFavorite(@RequestBody Map<String, String> favorite) {
    return ResponseEntity.ok(bffService.addFavorite(favorite));
  }

  @GetMapping("/users")
  public ResponseEntity<?> getAllUsers() {
    return ResponseEntity.ok(bffService.getAllUsers());
  }

  @GetMapping("/users/{email}")
  public ResponseEntity<?> getUserByEmail(@PathVariable("email") String email) {
    return ResponseEntity.ok(bffService.getUserByEmail(email));
  }
}
