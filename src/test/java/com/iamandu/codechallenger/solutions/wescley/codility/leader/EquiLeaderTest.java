package com.iamandu.codechallenger.solutions.wescley.codility.leader;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iamandu.codechallenger.problems.codility.leader.EquiLeader;

@SpringBootTest
public class EquiLeaderTest {

    @Autowired
    private EquiLeader equiLeader;
	
    @Test
    public void executeTest() {
    	int result1 = equiLeader.solution(new int[]{});
    	Assertions.assertThat(result1).isEqualTo(4);
    }

}
