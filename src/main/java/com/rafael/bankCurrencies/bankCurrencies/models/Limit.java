package com.rafael.bankCurrencies.bankCurrencies.models;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="limit")
public class Limit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "limit_id")
    private Long id;
    
    private LocalDateTime created;
    
    private BigDecimal sum;
    
    private BigDecimal remaining;
    
    private String currencyShortname;
    
    private String expenseCategory;
    
    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "limit")
    private List<Transaction> transactions;
    
    public Limit() {
    }

    public Limit(Long id, LocalDateTime created, BigDecimal sum, BigDecimal remaining, String currencyShortname, String expenseCategory, Client client, List<Transaction> transactions) {
        this.id = id;
        this.created = created;
        this.sum = sum;
        this.remaining = remaining;
        this.currencyShortname = currencyShortname;
        this.expenseCategory = expenseCategory;
        this.client = client;
        this.transactions = transactions;
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

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public BigDecimal getRemaining() {
        return remaining;
    }

    public void setRemaining(BigDecimal remaining) {
        this.remaining = remaining;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
