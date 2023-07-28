package com.iamandu.codechallenger.solutions.wescley.codility.prefixsums;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.prefixsums.GenomicRangeQuery;

@SpringBootTest
public class GenomicRangeQueryTest {

    @Autowired
    private GenomicRangeQuery genomicRangeQuery;
	
    @Test
    public void executeTest() {
    	int[] result1 = genomicRangeQuery.solution("CAGCCTA", new int[]{2,5,0}, new int[]{4,5,6});
    	Assertions.assertThat(result1[0]).isEqualTo(new int[] {2,4,1});
    }

}
