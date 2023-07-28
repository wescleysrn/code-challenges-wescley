package com.iamandu.codechallenger.solutions.wescley.codility.sorting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.sorting.NumberOfDiscIntersections;

@SpringBootTest
public class NumberOfDiscIntersectionsTest {

    @Autowired
    private NumberOfDiscIntersections numberOfDiscIntersections;
	
    @Test
    public void executeTest() {
    	int result1 = numberOfDiscIntersections.solution(new int[] {});
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
