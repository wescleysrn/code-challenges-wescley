package com.iamandu.codechallenger.solutions.wescley.leetcode.linkedlists;

import com.iamandu.codechallenger.problems.leetcode.linkedlists.FindMiddleNode;
import com.iamandu.codechallenger.problems.leetcode.linkedlists.LinkedList;

public class FindMiddleNodeImpl extends LinkedList implements FindMiddleNode {

	public FindMiddleNodeImpl(int value) {
		super(value);
	}

	@Override
    public Node findMiddleNode() {
        Node middle = this.head;
        Node fast = this.head;
        while(fast != this.tail) {
            middle = middle.next;
            Node nextFastNode = fast.next;
            if(nextFastNode == this.tail) {
                fast = nextFastNode;
            } else {
                fast = nextFastNode.next;
            }
        }
        return middle;
    }
	
}
