package com.safaricom.worldcup.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "world_cup")
public class WorldCup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "country_id")
    private Long countryId;

    public WorldCup() {

    }
    public Long getCountryId() {

        return countryId;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setCountryId(Long countryId) {

        this.countryId = countryId;
    }



}
