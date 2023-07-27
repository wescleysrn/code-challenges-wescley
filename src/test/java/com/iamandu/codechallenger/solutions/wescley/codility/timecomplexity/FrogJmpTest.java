package com.iamandu.codechallenger.solutions.wescley.codility.timecomplexity;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.timecomplexity.FrogJmp;

@SpringBootTest
public class FrogJmpTest {

    @Autowired
    private FrogJmp frogJmp;
	
    @Test
    public void executeTest() {
    	int result1 = frogJmp.solution(10,85,30);
    	Assertions.assertThat(result1).isEqualTo(3);
    }

}
