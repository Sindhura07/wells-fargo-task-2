package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Advisor advisor;

    @OneToMany(mappedBy = "client")
    private List<Portfolio> portfolios;

    public Client(Long id, String name, Advisor advisor, List<Portfolio> portfolios) {
        this.id = id;
        this.name = name;
        this.advisor = advisor;
        this.portfolios = portfolios;
    }

    public Client() {}

    public Long getId() { return id; }
    public String getName() { return name; }
    public Advisor getAdvisor() { return advisor; }
    public List<Portfolio> getPortfolios() { return portfolios; }

    public void setName(String name) { this.name = name; }
    public void setAdvisor(Advisor advisor) { this.advisor = advisor; }
    public void setPortfolios(List<Portfolio> portfolios) { this.portfolios = portfolios; }
}