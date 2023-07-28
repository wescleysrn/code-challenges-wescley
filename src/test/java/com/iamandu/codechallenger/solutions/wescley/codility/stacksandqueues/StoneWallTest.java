package com.iamandu.codechallenger.solutions.wescley.codility.stacksandqueues;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.stacksandqueues.StoneWall;

@SpringBootTest
public class StoneWallTest {

    @Autowired
    private StoneWall stoneWall;
	
    @Test
    public void executeTest() {
    	int result1 = stoneWall.solution(new int[] {});
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
