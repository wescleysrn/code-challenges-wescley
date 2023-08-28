package com.iamandu.codechallenger.solutions.wescley.leetcode.linkedlists;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HasLoopTest {

	@Test
    public void executeTest() {
		
		HasLoopImpl hasLoopImpl = new HasLoopImpl(1);
		
		hasLoopImpl.append(2);
		hasLoopImpl.append(3);
		hasLoopImpl.append(4);
		hasLoopImpl.append(5);
        
        // create a loop by connecting the tail to the second node
		hasLoopImpl.getTail().next = hasLoopImpl.getHead().next;
        

        System.out.println("Has Loop:");
        System.out.println( hasLoopImpl.hasLoop());

        /*
            EXPECTED OUTPUT:
            ----------------
            Has Loop:
            true

        */
        
        Assertions.assertThat(hasLoopImpl.hasLoop()).isTrue();
		
	}
	
}
