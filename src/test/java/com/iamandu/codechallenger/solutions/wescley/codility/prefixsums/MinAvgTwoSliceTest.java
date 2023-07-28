package com.iamandu.codechallenger.solutions.wescley.codility.prefixsums;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.prefixsums.MinAvgTwoSlice;

@SpringBootTest
public class MinAvgTwoSliceTest {

    @Autowired
    private MinAvgTwoSlice minAvgTwoSlice;
	
    @Test
    public void executeTest() {
    	int result1 = minAvgTwoSlice.solution(new int[]{4,2,2,5,1,5,8});
    	Assertions.assertThat(result1).isEqualTo(1);
    }

}
