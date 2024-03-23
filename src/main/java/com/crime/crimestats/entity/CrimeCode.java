package com.crime.crimestats.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CrimeCode {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long crimeCodeId;
    private String crimeCodeName;
    private String description;

    public Long getCrimeCodeId(){
        return crimeCodeId;
    }
    public String getCrimeCodeName(){
        return crimeCodeName;
    }
    public String getDescription(){
        return description;
    }
}
