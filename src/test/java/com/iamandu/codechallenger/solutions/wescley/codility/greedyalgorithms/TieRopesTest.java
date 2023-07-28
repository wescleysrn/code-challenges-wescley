package com.iamandu.codechallenger.solutions.wescley.codility.greedyalgorithms;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.greedyalgorithms.TieRopes;

@SpringBootTest
public class TieRopesTest {

    @Autowired
    private TieRopes tieRopes;
	
    @Test
    public void executeTest() {
    	int result1 = tieRopes.solution(1, new int[]{});
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
