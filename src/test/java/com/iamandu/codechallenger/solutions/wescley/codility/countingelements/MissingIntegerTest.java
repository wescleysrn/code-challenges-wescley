package com.iamandu.codechallenger.solutions.wescley.codility.countingelements;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.countingelements.MissingInteger;

@SpringBootTest
public class MissingIntegerTest {

    @Autowired
    private MissingInteger missingInteger;
	
    @Test
    public void executeTest() {
    	int result1 = missingInteger.solution(new int[]{1, 3, 6, 4, 1, 2});
    	Assertions.assertThat(result1).isEqualTo(5);
    	int result2 = missingInteger.solution(new int[]{1, 2, 3});
    	Assertions.assertThat(result2).isEqualTo(4);
    	int A[]={-1,-3};
    	int result3 = missingInteger.solution(A);
    	Assertions.assertThat(result3).isEqualTo(1);
    }

}
