package com.iamandu.codechallenger.solutions.wescley.leetcode.linkedlists;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FindMiddleNodeTest {
	
    @Test
    public void executeTest() {
    	
    	FindMiddleNodeImpl findMiddleNodeImpl = new FindMiddleNodeImpl(1);
    	
    	findMiddleNodeImpl.append(2);
    	findMiddleNodeImpl.append(3);
    	findMiddleNodeImpl.append(4);
    	findMiddleNodeImpl.append(5);

        System.out.println("Middle Node:");

        /*
            EXPECTED OUTPUT:
            ----------------
            Middle Node:
            3
        */
    	
    	int result = findMiddleNodeImpl.findMiddleNode().value;
    	Assertions.assertThat(result).isEqualTo(3);
    }
	
}
