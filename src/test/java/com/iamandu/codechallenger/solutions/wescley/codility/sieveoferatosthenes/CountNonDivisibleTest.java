package com.iamandu.codechallenger.solutions.wescley.codility.sieveoferatosthenes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.sieveoferatosthenes.CountNonDivisible;

@SpringBootTest
public class CountNonDivisibleTest {

    @Autowired
    private CountNonDivisible countNonDivisible;
	
    @Test
    public void executeTest() {
    	int[] result1 = countNonDivisible.solution(new int[]{});
    	Assertions.assertThat(result1[0]).isEqualTo(4);
    }

}
