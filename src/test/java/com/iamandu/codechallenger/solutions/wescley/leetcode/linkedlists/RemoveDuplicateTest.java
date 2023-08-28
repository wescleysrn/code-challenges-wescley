package com.iamandu.codechallenger.solutions.wescley.leetcode.linkedlists;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RemoveDuplicateTest {

	@Test
    public void executeTest() {
		RemoveDuplicateImpl removeDuplicateImpl = new RemoveDuplicateImpl(1);

		removeDuplicateImpl.append(1);
		removeDuplicateImpl.append(2);
		removeDuplicateImpl.append(2);
		removeDuplicateImpl.append(3);
		removeDuplicateImpl.append(3);
		removeDuplicateImpl.append(3);
		removeDuplicateImpl.append(4);

		removeDuplicateImpl.removeDuplicates();

		removeDuplicateImpl.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            1
            2
            3
            4
            
        */
		Assertions.assertThat(removeDuplicateImpl.length).isEqualTo(4);
	}
	
}
