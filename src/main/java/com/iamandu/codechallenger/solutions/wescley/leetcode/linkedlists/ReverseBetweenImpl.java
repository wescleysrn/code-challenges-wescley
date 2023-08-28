package com.iamandu.codechallenger.solutions.wescley.leetcode.linkedlists;

import com.iamandu.codechallenger.problems.leetcode.linkedlists.LinkedList;
import com.iamandu.codechallenger.problems.leetcode.linkedlists.ReverseBetween;

public class ReverseBetweenImpl extends LinkedList implements ReverseBetween {

	public ReverseBetweenImpl(int value) {
		super(value);
	}

	@Override
	public void reverseBetween(int m, int n) {
        if(head == null) return;
        
        Node dummy = new Node(0);
        dummy.next = head;
        
        Node prev = dummy;
        for(int i = 0; i < m; i++) {
            prev = prev.next;
        }
        
        Node current = prev.next;
        
        for(int i = 0; i < (n-m); i++) {
            Node temp = current.next;
            current.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }

        head = dummy.next;        
	}
	
}
