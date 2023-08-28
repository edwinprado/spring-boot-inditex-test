package com.test.indetex.controller;

import java.time.LocalDateTime;
import java.util.List;

import com.test.indetex.domain.PriceList;
import com.test.indetex.model.PriceResponseDTO;
import com.test.indetex.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PriceController {

  @Autowired
  PriceService priceService;

  @PostMapping("/list")
  public ResponseEntity<PriceList> createPriceList(@RequestBody final PriceList prices) {
    PriceList _prices = priceService.createPriceList(prices);
    return new ResponseEntity<>(_prices, HttpStatus.CREATED);
  }

  @GetMapping("/list")
  public ResponseEntity<List<PriceList>> getAllPricesList() {
    return new ResponseEntity<>(priceService.getAllPricesList(), HttpStatus.OK);
  }

  @GetMapping("/price")
  public ResponseEntity<PriceResponseDTO> getPriceResponse(@RequestParam(required = false) final LocalDateTime applicationDate,
                                                           @RequestParam(required = false) final String productId,
                                                           @RequestParam(required = false) final String brandId) {
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
