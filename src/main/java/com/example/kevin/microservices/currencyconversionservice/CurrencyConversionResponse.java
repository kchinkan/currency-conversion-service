package com.example.kevin.microservices.currencyconversionservice;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class CurrencyConversionResponse {
    private Long id;
    private String from;
    private String to;
    private BigDecimal quantity;
    private BigDecimal conversionMultiplier;
    private BigDecimal totalCalculatedAmount;
    private String environment;

    public CurrencyConversionResponse() {
    }

    public CurrencyConversionResponse(Long id, String from, String to, BigDecimal quantity, BigDecimal conversionMultiplier, BigDecimal totalCalculatedAmount, String environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.quantity = quantity;
        this.conversionMultiplier = conversionMultiplier;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.environment = environment;
    }
}
