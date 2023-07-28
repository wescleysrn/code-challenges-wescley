package com.iamandu.codechallenger.solutions.wescley.codility.prefixsums;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.prefixsums.CountDiv;

@SpringBootTest
public class CountDivTest {

    @Autowired
    private CountDiv countDiv;
	
    @Test
    public void executeTest() {
    	int result1 = countDiv.solution(6,11,2);
    	Assertions.assertThat(result1).isEqualTo(3);
    }

}
