package com.iamandu.codechallenger.solutions.wescley.codility.countingelements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.iamandu.codechallenger.problems.codility.countingelements.MissingInteger;

@Component
@Profile("wescley")
public class MissingIntegerImpl implements MissingInteger {

	// Score 100%
	@Override
	public int solution(int[] A) {
		//special case
        if(A.length ==0){
            return 1;
        }
        // Using "set" to check if an element has appeared
        // note: need to "import java.util.*" (important)
        Set<Integer> set = new HashSet<Integer>();
        
        // add elements into the set
        for(int i=0; i< A.length; i++){
            set.add(A[i]);
        }
        
        // note: the missing number is not possible bigger than (A.length)
        //       because there are only (A.length) numbers
        for(int i=1; i<= A.length; i++){
            if(set.contains(i) != true) // the 1st missing element
                return i;
        }
        
        // means: there are no missing numbers from 1 to A.length
        // Therefore, the missing number is "A.length+1" (important)
        return A.length+1;
	}

	// score 33%
	public int solutionInitial(int[] A) {
		int missingNumber = Integer.MIN_VALUE;
		Arrays.sort(A);
		missingNumber = A[0]+1;
		if(A[A.length-1] < 0 || A.length == 0) {
			return 1;
		}
		for (int i = 0; i < A.length; i++) {
			if(A[i] > missingNumber) {
				break;
			} else {
				missingNumber = A[i]+1;
			}
		}
		return missingNumber;
	}

}
