package com.iamandu.codechallenger.solutions.wescley.codility.caterpillarmethod;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.caterpillarmethod.CountTriangles;

@SpringBootTest
public class CountTrianglesTest {

    @Autowired
    private CountTriangles countTriangles;
	
    @Test
    public void executeTest() {
    	int result1 = countTriangles.solution(new int[]{});
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
