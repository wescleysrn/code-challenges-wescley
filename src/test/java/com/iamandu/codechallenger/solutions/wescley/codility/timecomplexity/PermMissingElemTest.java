package com.iamandu.codechallenger.solutions.wescley.codility.timecomplexity;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.timecomplexity.PermMissingElem;

@SpringBootTest
public class PermMissingElemTest {

    @Autowired
    private PermMissingElem permMissingElem;
	
    @Test
    public void executeTest() {
    	int result1 = permMissingElem.solution(new int[] {2,3,1,5});
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
