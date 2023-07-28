package com.iamandu.codechallenger.solutions.wescley.codility.greedyalgorithms;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.greedyalgorithms.MaxNonoverlappingSegments;

@SpringBootTest
public class MaxNonoverlappingSegmentsTest {

    @Autowired
    private MaxNonoverlappingSegments maxNonoverlappingSegments;
	
    @Test
    public void executeTest() {
    	int result1 = maxNonoverlappingSegments.solution(new int[]{}, new int[]{});
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
