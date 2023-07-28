package com.iamandu.codechallenger.solutions.wescley.codility.binarysearch;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.binarysearch.NailingPlanks;

@SpringBootTest
public class NailingPlanksTest {

    @Autowired
    private NailingPlanks nailingPlanks;
	
    @Test
    public void executeTest() {
    	int result1 = nailingPlanks.solution(new int[]{}, new int[]{}, new int[]{});
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
