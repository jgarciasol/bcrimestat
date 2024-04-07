package com.crime.crimestats;

import com.crime.crimestats.entity.CrimeCode;
import com.crime.crimestats.repository.CrimeCodeDaoImpl;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class CrimeCodeDAOTest {
    @Mock
    private JdbcTemplate jdbcTemplate;
    @InjectMocks
    private CrimeCodeDaoImpl crimeCodeDao;
    @Test
    public void testCrimeCodes(){
        when(jdbcTemplate.query(anyString(), any(RowMapper.class))).thenReturn(Arrays.asList(new CrimeCode()));
        List<CrimeCode> allCrimeCodes = crimeCodeDao.getAllCrimeCodes();
        assertThat(allCrimeCodes).isNotNull();
        assertThat(allCrimeCodes).isNotEmpty();
    }
}
