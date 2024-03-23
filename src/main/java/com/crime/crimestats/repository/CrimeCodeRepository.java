package com.crime.crimestats.repository;

import com.crime.crimestats.entity.CrimeCode;
import java.util.List;
public interface CrimeCodeRepository {
    List<CrimeCode> getAllCrimeCodes();
    CrimeCode getCrimeCodeById();
}
