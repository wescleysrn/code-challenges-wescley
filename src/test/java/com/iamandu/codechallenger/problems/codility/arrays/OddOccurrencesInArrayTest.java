package com.iamandu.codechallenger.problems.codility.arrays;

import java.util.Random;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OddOccurrencesInArrayTest {

    @Autowired
    private OddOccurrencesInArray oddOccurrencesInArray;
	
    @Test
    public void executeTest() {
    	int result1 = oddOccurrencesInArray.solution(new int[]{9,3,9,3,9,7,9});
    	Assertions.assertThat(result1).isEqualTo(7);
    	int result2 = oddOccurrencesInArray.solution(new int[]{3,7,3,5,9,11,7,9,5});
    	Assertions.assertThat(result2).isEqualTo(11);
    	// Performance Test
    	Random rd = new Random();
    	int[] arr1 = new int[20000];
    	for (int i = 0; i < arr1.length; i++) {
    		arr1[i] = rd.nextInt(1000000000-1) + 1;
		}
    	long start = System.currentTimeMillis();
    	int result3 = oddOccurrencesInArray.solution(arr1);
    	long finish = System.currentTimeMillis();
    	Assertions.assertThat(result3).isNotEqualTo(null);
    	Assertions.assertThat(finish - start).isLessThan(1120);
    }

}
