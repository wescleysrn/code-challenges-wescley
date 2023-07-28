package com.iamandu.codechallenger.solutions.wescley.codility.sorting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.sorting.Triangle;

@SpringBootTest
public class TriangleTest {

    @Autowired
    private Triangle triangle;
	
    @Test
    public void executeTest() {
    	int result1 = triangle.solution(new int[] {10,2,5,1,8,20});
    	Assertions.assertThat(result1).isEqualTo(1);
    	int result2 = triangle.solution(new int[] {10,50,5,1});
    	Assertions.assertThat(result2).isEqualTo(0);
    }

}
