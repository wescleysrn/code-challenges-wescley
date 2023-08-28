package com.iamandu.codechallenger.solutions.wescley.leetcode.linkedlists;

import com.iamandu.codechallenger.problems.leetcode.linkedlists.FindKthNodeFromEnd;
import com.iamandu.codechallenger.problems.leetcode.linkedlists.LinkedList;

public class FindKthNodeFromEndImpl extends LinkedList implements FindKthNodeFromEnd {

	public FindKthNodeFromEndImpl(int value) {
		super(value);
	}

	@Override
	public Node findKthFromEnd(int k) {
        Node slow = this.head;
        Node fast = this.head;
        for(int i = 0; i < k; i++) {
            if(fast == null) return null;
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
	}
	
}
