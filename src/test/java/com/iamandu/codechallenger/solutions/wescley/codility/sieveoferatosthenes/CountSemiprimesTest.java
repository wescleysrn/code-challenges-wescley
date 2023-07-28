package com.iamandu.codechallenger.solutions.wescley.codility.sieveoferatosthenes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.sieveoferatosthenes.CountSemiprimes;

@SpringBootTest
public class CountSemiprimesTest {

    @Autowired
    private CountSemiprimes countSemiprimes;
	
    @Test
    public void executeTest() {
    	int[] result1 = countSemiprimes.solution(1, new int[]{}, new int[]{});
    	Assertions.assertThat(result1[0]).isEqualTo(4);
    }

}
