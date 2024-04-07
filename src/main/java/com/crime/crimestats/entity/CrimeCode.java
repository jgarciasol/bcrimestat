package com.crime.crimestats.entity;

public class CrimeCode {

    private Long crimeCodeId;
    private String crimeCodeName;
    private String description;

    public CrimeCode(){}
    public CrimeCode(Long crimeCodeId, String crimeCodeName, String description){
        this.crimeCodeId = crimeCodeId;
        this.crimeCodeName = crimeCodeName;
        this.description = description;
    }
    public Long getCrimeCodeId(){
        return crimeCodeId;
    }
    public String getCrimeCodeName(){
        return crimeCodeName;
    }
    public String getDescription(){
        return description;
    }
    public void setCrimeCodeName(String crimeCodeName){
        this.crimeCodeName = crimeCodeName;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCrimeCodeId(Long crimeCodeId){
        this.crimeCodeId = crimeCodeId;
    }

    @Override
    public String toString() {
        return "Crime{id=%d, crime=%s description=%s}".formatted(crimeCodeId, crimeCodeName, description);
    }
}
