package com.iamandu.codechallenger.solutions.wescley.codility.primeandcomposite;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.primeandcomposite.Peaks;

@SpringBootTest
public class PeaksTest {

    @Autowired
    private Peaks peaks;
	
    @Test
    public void executeTest() {
    	int result1 = peaks.solution(new int[] {});
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
