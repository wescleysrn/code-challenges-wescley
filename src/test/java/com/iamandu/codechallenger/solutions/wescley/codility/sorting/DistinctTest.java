package com.iamandu.codechallenger.solutions.wescley.codility.sorting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.sorting.Distinct;

@SpringBootTest
public class DistinctTest {

    @Autowired
    private Distinct distinct;
	
    @Test
    public void executeTest() {
    	int result1 = distinct.solution(new int[] {2,1,1,2,3,1});
    	Assertions.assertThat(result1).isEqualTo(3);
    }

}
