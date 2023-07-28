package com.iamandu.codechallenger.solutions.wescley.codility.countingelements;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.countingelements.MaxCounters;

@SpringBootTest
public class MaxCountersTest {

    @Autowired
    private MaxCounters maxCounters;
	
    @Test
    public void executeTest() {
    	int[] result1 = maxCounters.solution(5, new int[]{3,4,4,6,1,4,4});
    	Assertions.assertThat(result1).isEqualTo(new int[] {3, 2, 2, 4, 2});
    }

}
