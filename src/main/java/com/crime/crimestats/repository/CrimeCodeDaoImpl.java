package com.crime.crimestats.repository;

import com.crime.crimestats.entity.CrimeCode;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CrimeCodeDaoImpl implements CrimeCodeDao {
    private JdbcTemplate jdbcTemplate;
    private final String FIND_CRIME_CODE = "select * from crimecode";
    private final String FIND_CRIME_CODE_ID = "select * from crimecode where crimecodeid = ?";

    public class CrimeCodeMapper implements RowMapper<CrimeCode>{

        @Override
        public CrimeCode mapRow(ResultSet rs, int rowNum) throws SQLException {
            CrimeCode crimeCode = new CrimeCode();
            crimeCode.setCrimeCodeId(rs.getLong("CrimeCodeID"));
            crimeCode.setCrimeCodeName(rs.getString("Crimecodename"));
            crimeCode.setDescription(rs.getString("Description"));
            return crimeCode;
        }
    }
    public CrimeCodeDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<CrimeCode> getAllCrimeCodes() {
        return jdbcTemplate.query(FIND_CRIME_CODE, new CrimeCodeMapper());
    }
    @Override
    public CrimeCode getCrimeCodeById(Long id) {
        return jdbcTemplate.queryForObject(FIND_CRIME_CODE_ID, new CrimeCodeMapper(), id);
        // return null;
    }
}
