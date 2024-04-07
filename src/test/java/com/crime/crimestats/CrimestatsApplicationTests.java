package com.crime.crimestats;

import com.crime.crimestats.entity.CrimeCode;
import com.crime.crimestats.repository.CrimeCodeDaoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CrimestatsApplicationTests {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Test
	public void testDBConnection() {
		Integer result = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
		assertThat(result).isNotNull();

	}

}
