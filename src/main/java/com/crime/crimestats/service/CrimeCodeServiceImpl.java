package com.crime.crimestats.service;
import com.crime.crimestats.entity.CrimeCode;
import com.crime.crimestats.repository.CrimeCodeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrimeCodeServiceImpl implements CrimeCodeService{

    private final CrimeCodeDao crimeCodeDao;

    @Autowired
    public CrimeCodeServiceImpl(CrimeCodeDao crimeCodeDao) {
        this.crimeCodeDao = crimeCodeDao;
    }

    @Override
    public List<CrimeCode> getAllCrimeCodes() {
        return crimeCodeDao.getAllCrimeCodes();
    }
}
