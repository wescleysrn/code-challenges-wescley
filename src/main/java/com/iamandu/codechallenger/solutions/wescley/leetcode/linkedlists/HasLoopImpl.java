package com.iamandu.codechallenger.solutions.wescley.leetcode.linkedlists;

import com.iamandu.codechallenger.problems.leetcode.linkedlists.HasLoop;
import com.iamandu.codechallenger.problems.leetcode.linkedlists.LinkedList;

public class HasLoopImpl extends LinkedList implements HasLoop {

	public HasLoopImpl(int value) {
		super(value);
	}

	@Override
	public boolean hasLoop() {
        Node slow = this.head;
        Node fast = this.head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
	}
	
}
