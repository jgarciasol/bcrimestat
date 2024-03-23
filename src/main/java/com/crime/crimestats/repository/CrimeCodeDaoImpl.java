package com.crime.crimestats.repository;

import com.crime.crimestats.entity.CrimeCode;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CrimeCodeDaoImpl implements CrimeCodeDao {
    private final JdbcTemplate jdbcTemplate;

    public CrimeCodeDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<CrimeCode> getAllCrimeCodes() {
        return null;
    }
    @Override
    public CrimeCode getCrimeCodeById(Long id) {
        return null; 
    }
}
