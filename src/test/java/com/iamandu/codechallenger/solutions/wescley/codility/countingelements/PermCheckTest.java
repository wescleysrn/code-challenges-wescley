package com.iamandu.codechallenger.solutions.wescley.codility.countingelements;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.countingelements.PermCheck;

@SpringBootTest
public class PermCheckTest {

    @Autowired
    private PermCheck permCheck;
	
    @Test
    public void executeTest() {
    	int result1 = permCheck.solution(new int[]{4,1,3,2});
    	Assertions.assertThat(result1).isEqualTo(1);
    	int result2 = permCheck.solution(new int[]{4,1,3});
    	Assertions.assertThat(result2).isEqualTo(0);
    }

}
