package com.iamandu.codechallenger.solutions.wescley.codility.prefixsums;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.prefixsums.PassingCars;

@SpringBootTest
public class PassingCarsTest {

    @Autowired
    private PassingCars passingCars;
	
    @Test
    public void executeTest() {
    	int result1 = passingCars.solution(new int[]{0,1,0,1,1});
    	Assertions.assertThat(result1).isEqualTo(5);
    }

}
