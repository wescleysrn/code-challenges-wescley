package com.iamandu.codechallenger.solutions.wescley.codility.binarysearch;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.binarysearch.MinMaxDivision;

@SpringBootTest
public class MinMaxDivisionTest {

    @Autowired
    private MinMaxDivision minMaxDivision;
	
    @Test
    public void executeTest() {
    	int result1 = minMaxDivision.solution(1,1, new int[]{});
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
