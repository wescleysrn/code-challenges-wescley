package com.iamandu.codechallenger.solutions.wescley.codility.iterations;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.iterations.BinaryGap;

@SpringBootTest
public class BinaryGapTest {

    @Autowired
    private BinaryGap binaryGap;
	
    @Test
    public void executeTest() {
    	int result1 = binaryGap.binaryGap(529);
    	Assertions.assertThat(result1).isEqualTo(4);
    	int result2 = binaryGap.binaryGap(20);
    	Assertions.assertThat(result2).isEqualTo(1);
    	int result3 = binaryGap.binaryGap(15);
    	Assertions.assertThat(result3).isEqualTo(0);
    	int result4 = binaryGap.binaryGap(32);
    	Assertions.assertThat(result4).isEqualTo(0);
    	int result5 = binaryGap.binaryGap(1041);
    	Assertions.assertThat(result5).isEqualTo(5);
    	int result6 = binaryGap.binaryGap(561892);
    	Assertions.assertThat(result6).isEqualTo(3);
    	int result7 = binaryGap.binaryGap(74901729);
    	Assertions.assertThat(result7).isEqualTo(4);
    	int result8 = binaryGap.binaryGap(1376796946);
    	Assertions.assertThat(result8).isEqualTo(5);
    }

}
