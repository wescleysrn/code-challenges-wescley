package com.challenge.codeinterview.solutions.wescley.codility.arrays;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.challenge.codeinterview.problems.codility.arrays.CyclicRotation;

@Component
@Profile("wescley")
public class CyclicRotationImpl implements CyclicRotation {

	@Override
	public int[] solution(int[] A, int K) {
		if(A.length==0) {
			return A;
		}
		while (K > 0) {
			int tail = A[A.length-1];
			for(int i = A.length-1; i > 0; --i) {
				A[i] = A[i-1];
			}
			A[0]=tail;
			--K;
		}
		return A;
	}

}
