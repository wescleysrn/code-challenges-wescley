package com.iamandu.codechallenger.solutions.wescley.leetcode.linkedlists;

import java.util.HashSet;
import java.util.Set;

import com.iamandu.codechallenger.problems.leetcode.linkedlists.LinkedList;
import com.iamandu.codechallenger.problems.leetcode.linkedlists.RemoveDuplicate;

public class RemoveDuplicateImpl extends LinkedList implements RemoveDuplicate {

	public RemoveDuplicateImpl(int value) {
		super(value);
	}

	@Override
	public void removeDuplicates() {
        Set<Integer> values = new HashSet<Integer>();
        Node previus = null;
        Node current = this.head;
        while(current != null) {
            if(values.contains(current.value)) {
                previus.next = current.next;
                this.length--;
            } else {
                values.add(current.value);
                previus = current;
            }
            current = current.next;
        }
	}
	
}
