package com.iamandu.codechallenger.solutions.wescley.codility.dynamicprogramming;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.dynamicprogramming.MinAbsSum;

@SpringBootTest
public class MinAbsSumTest {

    @Autowired
    private MinAbsSum minAbsSum;
	
    @Test
    public void executeTest() {
    	int result1 = minAbsSum.solution(new int[]{});
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
