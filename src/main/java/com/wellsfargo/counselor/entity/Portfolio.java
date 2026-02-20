package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

    public Portfolio(Long id, String name, Client client, List<Security> securities) {
        this.id = id;
        this.name = name;
        this.client = client;
        this.securities = securities;
    }

    public Portfolio() {}

    public Long getId() { return id; }
    public String getName() { return name; }
    public Client getClient() { return client; }
    public List<Security> getSecurities() { return securities; }

    public void setName(String name) { this.name = name; }
    public void setClient(Client client) { this.client = client; }
    public void setSecurities(List<Security> securities) { this.securities = securities; }
}