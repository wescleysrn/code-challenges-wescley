package com.iamandu.codechallenger.solutions.wescley.codility.sorting;

	import java.util.Arrays;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.iamandu.codechallenger.problems.codility.sorting.MaxProductOfThree;

@Component
@Profile("wescley")
public class MaxProductOfThreeImpl implements MaxProductOfThree {

	// Score 100%
	@Override
	public int solution(int[] A) {
		// main idea: 
        // max_1 = positive * positive * positive
        // max_2 = negative * negative * positive
        // max = Math.max(max_1, max_1)
        // just need to sort the integer array
        
        // sort the array
        Arrays.sort(A);

        // max_1 = 1st biggest * 2nd biggest * 3rd biggest 
        int max_1 = A[A.length-1] * A[A.length-2] * A[A.length-3];
        
        // max_2 = 1st smallest * 2nd smallest * 1st biggest
        int max_2 = A[0] * A[1] * A[A.length-1];

        // take the maximum        
        int max = Math.max(max_1, max_2);
        
        return max;
	}

	// Score 44%
	public int solutionInitial(int[] A) {
		Arrays.sort(A); // Sort made the result wrong because the order of product calculation matter
		int size = A.length;
		return A[size-1]*A[size-2]*A[size-3];
	}

}
