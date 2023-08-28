package com.iamandu.codechallenger.solutions.wescley.leetcode.linkedlists;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PartitionListTest {

	@Test
    public void executeTest() {
		PartitionListImpl partitionListImpl = new PartitionListImpl(3);
		partitionListImpl.append(5);
		partitionListImpl.append(8);
		partitionListImpl.append(10);
		partitionListImpl.append(2);
		partitionListImpl.append(1);

        // Print the list before partitioning
        System.out.println("LL before partitionList:");
        partitionListImpl.printList(); // Output: 3 5 8 10 2 1

        // Call the partitionList method with x = 5
        partitionListImpl.partitionList(5);

        // Print the list after partitioning
        System.out.println("\nLL after partitionList:");
        partitionListImpl.printList(); // Output: 3 2 1 5 8 10

        /*
            EXPECTED OUTPUT:
            ----------------
            LL before partition_list:
            3
            5
            8
            10
            2
            1
            
            LL after partition_list:
            3
            2
            1
            5
            8
            10

        */
	}
	
}
