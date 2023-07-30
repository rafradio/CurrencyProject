package com.rafael.bankCurrencies.bankCurrencies.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long id;
    
    private LocalDateTime created;
    
    @Column(length=10)
    private String accountFrom;
    
    @Column(length=10)
    private String accountTo;
    
    private BigDecimal sum;
    
    private String currencyShortname;
    
    private String expenseCategory;
    
    private boolean exceeded;
    
    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;
    
    @ManyToOne
    @JoinColumn(name="limit_id")
    private Limit limit;
    
    public Transaction() {
    }

    public Transaction(Long id, LocalDateTime created, String accountFrom, String accountTo, BigDecimal sum, String currencyShortname, String expenseCategory, boolean exceeded, Client client, Limit limit) {
        this.id = id;
        this.created = created;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.sum = sum;
        this.currencyShortname = currencyShortname;
        this.expenseCategory = expenseCategory;
        this.exceeded = exceeded;
        this.client = client;
        this.limit = limit;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(String accountFrom) {
        this.accountFrom = accountFrom;
    }

    public String getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(String accountTo) {
        this.accountTo = accountTo;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public String getCurrencyShortname() {
        return currencyShortname;
    }

    public void setCurrencyShortname(String currencyShortname) {
        this.currencyShortname = currencyShortname;
    }

    public String getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(String expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public boolean isExceeded() {
        return exceeded;
    }

    public void setExceeded(boolean exceeded) {
        this.exceeded = exceeded;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Limit getLimit() {
        return limit;
    }

    public void setLimit(Limit limit) {
        this.limit = limit;
    }

    
}
