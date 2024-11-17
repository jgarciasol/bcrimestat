package com.crime.crimestats.controller;

import com.crime.crimestats.entity.CrimeCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
public class CrimeCodeController {
    private final CrimeCodeController crimeCodeService;

    @Autowired
    public CrimeCodeController(CrimeCodeController crimeCodeService) {
        this.crimeCodeService = crimeCodeService;
    }

    @GetMapping
    public List<CrimeCode> getAllCrimeCodes(){
        return crimeCodeService.getAllCrimeCodes();
    }
}
