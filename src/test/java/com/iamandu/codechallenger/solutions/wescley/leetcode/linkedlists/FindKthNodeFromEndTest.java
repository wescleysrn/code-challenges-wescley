package com.iamandu.codechallenger.solutions.wescley.leetcode.linkedlists;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FindKthNodeFromEndTest {

	@Test
    public void executeTest() {
		FindKthNodeFromEndImpl findKthNodeFromEndImpl = new FindKthNodeFromEndImpl(1);
		findKthNodeFromEndImpl.append(2);
		findKthNodeFromEndImpl.append(3);
		findKthNodeFromEndImpl.append(4);
		findKthNodeFromEndImpl.append(5);

        int k = 2;
        int result = findKthNodeFromEndImpl.findKthFromEnd(k).value;

        System.out.println(result); // Output: 4

        /*
        EXPECTED OUTPUT:
        ----------------
        4            
        */
        
        Assertions.assertThat(result).isEqualTo(4);
        
	}
	
}
