package com.iamandu.codechallenger.solutions.wescley.codility.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.iamandu.codechallenger.problems.codility.sorting.Triangle;

@Component
@Profile("wescley")
public class TriangleImpl implements Triangle {

	@Override
	public int solution(int[] A) {
		// main idea: for any combination (A[i-2], A[i-1], A[i]) 
	    // we just need to check if A[i-2] + A[i-1] > A[i] (important)
	    // note: A[i-2] + A[i-1] is the max possible combination (needed to check)

        // Using "Arrays.sort(int[])"
        Arrays.sort(A);
        
        // note: start from i=2
        for(int i=2; i< A.length; i++){
            if((long)A[i-2] + (long)A[i-1] > (long)A[i]) // note: using "long" for overflow cases
                return 1; 
            // note: we just need one combination
        }
        
        // otherwise, return 0 (no triangular)
        return 0;
	}

	// Score 56%
	public int solutionInitial(int[] A) {
		// It's necessary i find all combinations of triplets ?
		List<List<Integer>> triplets = new ArrayList<List<Integer>>();
		// What kind of distance the numbers must have in order to the sum operation between two of them 
		// is bigger than the last one
		// Get the number in the middle and testing then ??
		// Form all combination of triplets
		for (int i = 0; i < A.length; i++) {
			int second = i+1;
			while (second < A.length-1) {
				int third = second +1;
				while (third < A.length) {
					List<Integer> tripletsIndex = new ArrayList<Integer>();
					tripletsIndex.add(i);
					tripletsIndex.add(second);
					tripletsIndex.add(third);
					triplets.add(tripletsIndex);				
					++third;
				}
				++second;
			}
		}
		for (List<Integer> triplet : triplets) {
			if((A[triplet.get(0)] + A[triplet.get(1)] > A[triplet.get(2)]) &&
			   (A[triplet.get(1)] + A[triplet.get(2)] > A[triplet.get(0)]) &&
			   (A[triplet.get(2)] + A[triplet.get(0)] > A[triplet.get(1)])) {
				return 1;
			}
		}
		return 0;
	}

}
