package com.crime.crimestats.entity;

public class CrimeCode {

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
