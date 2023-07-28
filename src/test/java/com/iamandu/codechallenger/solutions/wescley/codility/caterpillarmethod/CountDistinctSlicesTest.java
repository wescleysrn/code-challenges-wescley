package com.iamandu.codechallenger.solutions.wescley.codility.caterpillarmethod;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.caterpillarmethod.CountDistinctSlices;

@SpringBootTest
public class CountDistinctSlicesTest {

    @Autowired
    private CountDistinctSlices countDistinctSlices;
	
    @Test
    public void executeTest() {
    	int result1 = countDistinctSlices.solution(1, new int[]{});
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
