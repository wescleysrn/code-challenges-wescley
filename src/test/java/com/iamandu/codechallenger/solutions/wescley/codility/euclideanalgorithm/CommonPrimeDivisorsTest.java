package com.iamandu.codechallenger.solutions.wescley.codility.euclideanalgorithm;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.euclideanalgorithm.CommonPrimeDivisors;

@SpringBootTest
public class CommonPrimeDivisorsTest {

    @Autowired
    private CommonPrimeDivisors commonPrimeDivisors;
	
    @Test
    public void executeTest() {
    	int result1 = commonPrimeDivisors.solution(new int[]{}, new int[]{});
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
