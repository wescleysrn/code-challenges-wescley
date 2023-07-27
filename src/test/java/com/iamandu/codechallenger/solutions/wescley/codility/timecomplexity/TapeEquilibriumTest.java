package com.iamandu.codechallenger.solutions.wescley.codility.timecomplexity;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.timecomplexity.TapeEquilibrium;

@SpringBootTest
public class TapeEquilibriumTest {

    @Autowired
    private TapeEquilibrium tapeEquilibrium;
	
    @Test
    public void executeTest() {
    	int result1 = tapeEquilibrium.solution(new int[] {3,1,2,4,3});
    	Assertions.assertThat(result1).isEqualTo(1);
    }

}
