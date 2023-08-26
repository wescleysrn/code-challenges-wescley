package com.iamandu.codechallenger.solutions.wescley.codility.jobs;

import java.util.Collections;
import java.util.Map;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.jobs.AgileEngine01;
import com.iamandu.codechallenger.problems.codility.jobs.UserStats;

@SpringBootTest
public class AgileEngine01Test {

    @Autowired
    private AgileEngine01 agileEngine01;
	
    @SuppressWarnings("unchecked")
	@Test
    public void executeTest() {
    	Map<Long, Long> result = agileEngine01.count(
			Collections.singletonMap("1", new UserStats(5L)),
			Collections.singletonMap("1", new UserStats(2L)),

			Collections.singletonMap("2", new UserStats(8L)),

			Collections.singletonMap("3", new UserStats(2L))			
    	);
    	Assertions.assertThat(result).isNotEmpty();
    	Assertions.assertThat(result.get(1L)).isEqualTo(7L);
    	Assertions.assertThat(result.get(2L)).isEqualTo(8L);
    	Assertions.assertThat(result.get(3L)).isEqualTo(2L);
    }
    
}
