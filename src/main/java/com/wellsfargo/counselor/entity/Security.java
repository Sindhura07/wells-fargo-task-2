package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ticker;
    private String name;

    @ManyToOne
    private Portfolio portfolio;

    public Security(Long id, String ticker, String name, Portfolio portfolio) {
        this.id = id;
        this.ticker = ticker;
        this.name = name;
        this.portfolio = portfolio;
    }

    public Security() {}

    public Long getId() { return id; }
    public String getTicker() { return ticker; }
    public String getName() { return name; }
    public Portfolio getPortfolio() { return portfolio; }

    public void setTicker(String ticker) { this.ticker = ticker; }
    public void setName(String name) { this.name = name; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
}