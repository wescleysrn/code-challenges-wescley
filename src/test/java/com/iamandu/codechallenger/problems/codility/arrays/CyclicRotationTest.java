package com.iamandu.codechallenger.problems.codility.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CyclicRotationTest {

    @Autowired
    private CyclicRotation cyclicRotation;
	
    @Test
    public void executeTest() {
    	int[] result1 = cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 3);
    	Assertions.assertThat(result1).isEqualTo(new int[]{9, 7, 6, 3, 8});
    	int[] result2 = cyclicRotation.solution(new int[]{0, 0, 0}, 1);
    	Assertions.assertThat(result2).isEqualTo(new int[]{0, 0, 0});
    	int[] result3 = cyclicRotation.solution(new int[]{1, 2, 3, 4}, 4);
    	Assertions.assertThat(result3).isEqualTo(new int[]{1, 2, 3, 4});
    	int[] result4 = cyclicRotation.solution(new int[]{}, 0);
    	Assertions.assertThat(result4).isEqualTo(new int[]{});
    }

}
