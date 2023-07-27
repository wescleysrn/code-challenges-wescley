package com.iamandu.codechallenger.solutions.wescley.codility.timecomplexity;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.iamandu.codechallenger.problems.codility.timecomplexity.PermMissingElem;

@Component
@Profile("wescley")
public class PermMissingElemImpl implements PermMissingElem {

	@Override
	public int solution(int[] A) {
		int missingElem = 0;
		int[] ordered = new int[A.length+1];
		for (int i = 0; i < A.length; i++) {
			int value = A[i];
			ordered[value-1] = value;
		}
		for (int i = 0; i < ordered.length; i++) {
			if(ordered[i] == 0) {
				missingElem = i + 1;
				break;
			}
		}
		return missingElem;
	}

}
