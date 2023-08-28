package com.iamandu.codechallenger.solutions.wescley.leetcode.linkedlists;

import com.iamandu.codechallenger.problems.leetcode.linkedlists.LinkedList;
import com.iamandu.codechallenger.problems.leetcode.linkedlists.PartitionList;

public class PartitionListImpl extends LinkedList implements PartitionList {

	public PartitionListImpl(int value) {
		super(value);
	}

	@Override
	public void partitionList(int x) {
        if(this.head == null) return;
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        Node current = this.head;
        while(current != null) {
            if(current.value < x){
                prev1.next = current;
                prev1 = current;
            } else {
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;
        }
        prev2.next = null;
        prev1.next = dummy2.next;
        this.head = dummy1.next;
	}
	
}
