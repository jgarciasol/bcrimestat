package com.crime.crimestats.controller;

import com.crime.crimestats.entity.CrimeCode;
import com.crime.crimestats.service.CrimeCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/crimecodes")
public class CrimeCodeController {
    private final CrimeCodeService crimeCodeService;   // Correct

    @Autowired
    public CrimeCodeController(CrimeCodeService crimeCodeService) {
        this.crimeCodeService = crimeCodeService;
    }

    @GetMapping
    public List<CrimeCode> getAllCrimeCodes(){
        return crimeCodeService.getAllCrimeCodes();
    }
}
