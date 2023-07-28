package com.iamandu.codechallenger.solutions.wescley.codility.fibonaccinumbers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.fibonaccinumbers.Ladder;

@SpringBootTest
public class LadderTest {

    @Autowired
    private Ladder ladder;
	
    @Test
    public void executeTest() {
    	int[] result1 = ladder.solution(new int[]{}, new int[]{});
    	Assertions.assertThat(result1[0]).isEqualTo(4);
    }

}
