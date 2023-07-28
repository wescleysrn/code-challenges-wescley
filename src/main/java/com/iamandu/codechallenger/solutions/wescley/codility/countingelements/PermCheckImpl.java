package com.iamandu.codechallenger.solutions.wescley.codility.countingelements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.iamandu.codechallenger.problems.codility.countingelements.PermCheck;

@Component
@Profile("wescley")
public class PermCheckImpl implements PermCheck {

	// score 100%
	@Override
	public int solution(int[] A) {
        // to check "permutation"
        // the main idea is as follows:
        // 1. use set to remember which elements have appeared
        // 2. use "for loop" to check if all the elements from "1 to A.length" appeared
        // If all the elements have appeared, then "yes".
        // Otherwise, "no".
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i=0; i < A.length; i++){
            set.add(A[i]);
        }
        
        // check if "all" the elements from "1 to A.length" appeared
        for(int i=1; i<= A.length; i++){
            if( set.contains(i) == false )
                return 0; // not a permutation (A[i] is missing)
        }
        
        // if it contains all the elements (from "1 to A.length")
        // then, "yes"
        return 1;
	}

	// Score 41%
	public int solutionInitial(int[] A) {
		int[] leavesPositions = new int[A.length+1];
		leavesPositions[3]=3;
		for (Integer element : A) {
			if(leavesPositions.length-1 < element) {
				leavesPositions = Arrays.copyOfRange(leavesPositions,0,element+1);
			}
			leavesPositions[element]=element;
		}
		if(Arrays.stream(Arrays.copyOfRange(leavesPositions, 1, leavesPositions.length))
				 .allMatch(element -> element != 0)) {			
			return 1;
		}
		return 0;
	}
	
	// score 100%
	public int solution2(int[] A) {
	    Arrays.sort(A);
	    for (int idx = 0; idx < A.length; idx++) {
	      if (A[idx] != idx + 1) {
	        return 0;
	      }
	    }
	    return 1;
	}

}
