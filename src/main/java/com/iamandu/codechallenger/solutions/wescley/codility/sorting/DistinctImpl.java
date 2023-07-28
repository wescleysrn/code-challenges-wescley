package com.iamandu.codechallenger.solutions.wescley.codility.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.iamandu.codechallenger.problems.codility.sorting.Distinct;

@Component
@Profile("wescley")
public class DistinctImpl implements Distinct {

	// Score 100%
	@Override
	public int solution(int[] A) {
		// special case
        if(A.length ==0)
            return 0;
      
      // initial setting: one distinct number
        int result =1;
        
      // Using "Arrays.sort(A)" (important)
        Arrays.sort(A);
        
      // for counting the distinct numbers
        for(int i=1; i < A.length; i++){
            if(A[i] != A[i-1]){ // distinct
                result++; 
            }
        }
        
        return result; // return the number of distinct values
	}

	// Score 100% - For the first time i find my solution better
	public int solutionInitial(int[] A) {
		Set<Integer> distinct = new HashSet<Integer>();
		for (int number : A) {
			distinct.add(number);
		}
		return distinct.size();
	}
	
}
