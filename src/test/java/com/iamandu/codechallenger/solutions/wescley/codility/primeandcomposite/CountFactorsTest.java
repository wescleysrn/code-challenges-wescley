package com.iamandu.codechallenger.solutions.wescley.codility.primeandcomposite;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.primeandcomposite.CountFactors;

@SpringBootTest
public class CountFactorsTest {

    @Autowired
    private CountFactors countFactors;
	
    @Test
    public void executeTest() {
    	int result1 = countFactors.solution(1);
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
