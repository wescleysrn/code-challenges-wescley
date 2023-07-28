package com.iamandu.codechallenger.solutions.wescley.codility.stacksandqueues;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.stacksandqueues.Brackets;

@SpringBootTest
public class BracketsTest {

    @Autowired
    private Brackets brackets;
	
    @Test
    public void executeTest() {
    	int result1 = brackets.solution("");
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
