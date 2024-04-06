package com.crime.crimestats.repository;
import com.crime.crimestats.entity.CrimeCode;
import java.util.List;
public interface CrimeCodeDao {
    List<CrimeCode> getAllCrimeCodes();
    CrimeCode getCrimeCodeById(Long id);
}
