package com.iamandu.codechallenger.solutions.wescley.leetcode.linkedlists;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReverseBetweenTest {

	@Test
    public void executeTest() {
		// Create a linked list with values 1, 2, 3, 4, and 5
		ReverseBetweenImpl reverseBetweenImpl = new ReverseBetweenImpl(1);
		reverseBetweenImpl.append(2);
		reverseBetweenImpl.append(3);
		reverseBetweenImpl.append(4);
		reverseBetweenImpl.append(5);

        System.out.println("Original linked list: ");
        reverseBetweenImpl.printList();

        // Reverse a sublist within the linked list
        reverseBetweenImpl.reverseBetween(1, 3);
        System.out.println("\nReversed sublist (1, 3): ");
        reverseBetweenImpl.printList();

        // Reverse another sublist within the linked list
        reverseBetweenImpl.reverseBetween(0, 4);
        System.out.println("\nReversed entire linked list: ");
        reverseBetweenImpl.printList();

        // Reverse a sublist of length 1 within the linked list
        reverseBetweenImpl.reverseBetween(2, 2);
        System.out.println("\nReversed sublist of length 1 (2, 2): ");
        reverseBetweenImpl.printList();

        // Reverse an empty linked list
        ReverseBetweenImpl emptyList = new ReverseBetweenImpl(0);
        emptyList.makeEmpty();
        emptyList.reverseBetween(0, 0);
        System.out.println("\nReversed empty linked list: ");
        emptyList.printList();
        
        /*
            EXPECTED OUTPUT:
            ----------------
            Original linked list: 
            1
            2
            3
            4
            5
            
            Reversed sublist (1, 3): 
            1
            4
            3
            2
            5
            
            Reversed entire linked list: 
            5
            2
            3
            4
            1
            
            Reversed sublist of length 1 (2, 2): 
            5
            2
            3
            4
            1
            
            Reversed empty linked list: 
        
        */
        
        Assertions.assertThat(reverseBetweenImpl.length).isEqualTo(5);
        Assertions.assertThat(emptyList.length).isEqualTo(0);
        
	}
	
}
