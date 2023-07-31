package com.rafael.bankCurrencies.bankCurrencies.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="conversion")
public class Conversion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "conversion_id")
    private UUID id;
    
    private BigDecimal rate;
    
    private BigDecimal rateOnPreviousClose;
    
    @Column(unique=true)
    private LocalDateTime madeAt;
    
    @Column(unique=true)
    private String symbol;

    public Conversion() {
    }

    public Conversion(UUID id, BigDecimal rate, BigDecimal rateOnPreviousClose, LocalDateTime madeAt, String symbol) {
        this.id = id;
        this.rate = rate;
        this.rateOnPreviousClose = rateOnPreviousClose;
        this.madeAt = madeAt;
        this.symbol = symbol;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getRateOnPreviousClose() {
        return rateOnPreviousClose;
    }

    public void setRateOnPreviousClose(BigDecimal rateOnPreviousClose) {
        this.rateOnPreviousClose = rateOnPreviousClose;
    }

    public LocalDateTime getMadeAt() {
        return madeAt;
    }

    public void setMadeAt(LocalDateTime madeAt) {
        this.madeAt = madeAt;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
}
