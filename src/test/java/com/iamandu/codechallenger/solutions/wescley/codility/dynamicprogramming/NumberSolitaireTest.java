package com.iamandu.codechallenger.solutions.wescley.codility.dynamicprogramming;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.dynamicprogramming.NumberSolitaire;

@SpringBootTest
public class NumberSolitaireTest {

    @Autowired
    private NumberSolitaire numberSolitaire;
	
    @Test
    public void executeTest() {
    	int result1 = numberSolitaire.solution(new int[]{});
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
