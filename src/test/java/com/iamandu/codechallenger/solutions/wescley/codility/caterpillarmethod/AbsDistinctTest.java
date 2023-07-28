package com.iamandu.codechallenger.solutions.wescley.codility.caterpillarmethod;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.caterpillarmethod.AbsDistinct;

@SpringBootTest
public class AbsDistinctTest {

    @Autowired
    private AbsDistinct absDistinct;
	
    @Test
    public void executeTest() {
    	int result1 = absDistinct.solution(new int[]{});
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
