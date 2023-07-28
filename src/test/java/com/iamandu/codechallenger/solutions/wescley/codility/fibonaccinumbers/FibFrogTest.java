package com.iamandu.codechallenger.solutions.wescley.codility.fibonaccinumbers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.fibonaccinumbers.FibFrog;

@SpringBootTest
public class FibFrogTest {

    @Autowired
    private FibFrog fibFrog;
	
    @Test
    public void executeTest() {
    	int result1 = fibFrog.solution(new int[]{});
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
