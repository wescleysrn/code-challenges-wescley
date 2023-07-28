package com.iamandu.codechallenger.solutions.wescley.codility.countingelements;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.countingelements.FrogRiverOne;

@SpringBootTest
public class FrogRiverOneTest {

    @Autowired
    private FrogRiverOne frogRiverOne;
	
    @Test
    public void executeTest() {
    	int result1 = frogRiverOne.solution(5, new int[]{1,3,1,4,2,3,5,4});
    	Assertions.assertThat(result1).isEqualTo(6);
    }

}
