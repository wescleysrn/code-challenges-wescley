package com.iamandu.codechallenger.solutions.wescley.codility.primeandcomposite;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.primeandcomposite.MinPerimeterRectangle;

@SpringBootTest
public class MinPerimeterRectangleTest {

    @Autowired
    private MinPerimeterRectangle minPerimeterRectangle;
	
    @Test
    public void executeTest() {
    	int result1 = minPerimeterRectangle.solution(1);
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
