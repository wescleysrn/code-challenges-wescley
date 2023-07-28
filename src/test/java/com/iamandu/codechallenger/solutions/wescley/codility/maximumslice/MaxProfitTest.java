package com.iamandu.codechallenger.solutions.wescley.codility.maximumslice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.maximumslice.MaxProfit;

@SpringBootTest
public class MaxProfitTest {

    @Autowired
    private MaxProfit maxProfit;
	
    @Test
    public void executeTest() {
    	int result1 = maxProfit.solution(new int[]{});
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
