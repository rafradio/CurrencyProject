package com.rafael.bankCurrencies.bankCurrencies.models;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private long id;
    
    private LocalDateTime created;
    
    @Column(unique=true, length=10)
    private String bankAccountNumber;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    private List<Transaction> transactions;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    private List<Limit> limits;
    
    public Client() {
    }

    public Client(Long id, LocalDateTime created, String bankAccountNumber, List<Transaction> transactions, List<Limit> limits) {
        this.id = id;
        this.created = created;
        this.bankAccountNumber = bankAccountNumber;
        this.transactions = transactions;
        this.limits = limits;
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

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<Limit> getLimits() {
        return limits;
    }

    public void setLimits(List<Limit> limits) {
        this.limits = limits;
    }
}
