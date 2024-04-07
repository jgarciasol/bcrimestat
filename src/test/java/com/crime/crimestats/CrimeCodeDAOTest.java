package com.crime.crimestats;

import com.crime.crimestats.entity.CrimeCode;
import com.crime.crimestats.repository.CrimeCodeDaoImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CrimeCodeDAOTest {

    @Autowired
    private CrimeCodeDaoImpl crimeCodeDao;

    @Test
    public void testCrimeCodes(){
        List<CrimeCode> allCrimeCodes = crimeCodeDao.getAllCrimeCodes();
        System.out.println(allCrimeCodes);
        assertThat(allCrimeCodes).isNotNull();
        assertThat(allCrimeCodes).isNotEmpty();
    }
}
