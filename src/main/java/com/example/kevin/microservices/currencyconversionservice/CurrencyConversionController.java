package com.example.kevin.microservices.currencyconversionservice;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class CurrencyConversionController {
    private final CurrencyExchangeProxy proxy;
    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionResponse getCurrencyConversion(@PathVariable String from,
                                                            @PathVariable String to,
                                                            @PathVariable BigDecimal quantity) {

        CurrencyConversionResponse response = proxy.getCurrencyExchange(from, to);
        response.setQuantity(quantity);
        response.setTotalCalculatedAmount(quantity.multiply(response.getConversionMultiplier()));

        return response;
    }
}
