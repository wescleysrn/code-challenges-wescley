package com.iamandu.codechallenger.solutions.wescley.codility.maximumslice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.maximumslice.MaxDoubleSliceSum;

@SpringBootTest
public class MaxDoubleSliceSumTest {

    @Autowired
    private MaxDoubleSliceSum maxDoubleSliceSum;
	
    @Test
    public void executeTest() {
    	int result1 = maxDoubleSliceSum.solution(new int[]{});
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
