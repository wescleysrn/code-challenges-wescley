package com.iamandu.codechallenger.solutions.wescley.codility.sorting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.sorting.MaxProductOfThree;

@SpringBootTest
public class MaxProductOfThreeTest {

    @Autowired
    private MaxProductOfThree maxProductOfThree;
	
    @Test
    public void executeTest() {
    	int result1 = maxProductOfThree.solution(new int[] {-3,1,2,-2,5,6});
    	Assertions.assertThat(result1).isEqualTo(60);
    }

}
