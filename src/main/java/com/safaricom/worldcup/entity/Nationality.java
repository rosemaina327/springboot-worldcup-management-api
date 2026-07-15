package com.safaricom.worldcup.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "nationalities")

public class Nationality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "country_name")
    private String countryName;

    public Nationality() {

    }
    public Long getId() {

        return id;
    }
    public void setId(Long id){

        this.id = id;
    }
    public String getCountryName() {

        return countryName;
    }
    public void setCountryName(String countryName) {

        this.countryName = countryName;
    }

}
