package com.iamandu.codechallenger.solutions.wescley.codility.euclideanalgorithm;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.euclideanalgorithm.ChocolatesByNumbers;

@SpringBootTest
public class ChocolatesByNumbersTest {

    @Autowired
    private ChocolatesByNumbers chocolatesByNumbers;
	
    @Test
    public void executeTest() {
    	int result1 = chocolatesByNumbers.solution(1,1);
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
