package com.iamandu.codechallenger.solutions.wescley.codility.countingelements;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.iamandu.codechallenger.problems.codility.countingelements.MaxCounters;

@Component
@Profile("wescley")
public class MaxCountersImpl implements MaxCounters {

	// Score 100%
	@Override
	public int[] solution(int N, int[] A) {
		// new integer array
		int[] counter = new int[N];
		// 1. key point: maintain the max value
		int maxCounter = 0;
		// 2. key point: maintain the current_min (very important!!!)
        // so, we can move "the 2nd for-loop" outside "the 1st for-loop" 
        // by maintaining "min"
        int min=0;        
		for (int i = 0; i < A.length; i++) {
			if( A[i] >= 1 && A[i] <= N){ // normal case
				// important: check the "min" before "increasing by 1"
                if(counter[ A[i] -1] < min){
                	counter[ A[i] -1] = min; // update it to "min"
                }
                
                counter[ A[i] -1 ] ++;  // increased by 1
                
                if( counter[ A[i] -1 ] > maxCounter){ // maintain max
                	maxCounter = counter[ A[i] -1 ];
                }
			} else if( A[i] == N+1){      // special case 
			    /* cannot use for-loop (will take too much time)
                for(int j=0; j<my_array.length; j++){
                    my_array[j] = max;
                }
                // instead, we maintain "min", so we can move the for-loop outside */ 
                min = maxCounter; // all the values should be bigger than "max"
                           // therefore, "min = max"
			}
			
		}
		// move the 2nd for-loop outside the 1st for-loop
        // update some elements who have not been updated yet
        for(int j=0; j<counter.length; j++){
            if(counter[j] < min){
            	counter[j] = min; // update it to "min"
            }
        }		
		return counter;
	}

	// Score 77%
	// The problem here is the second for inside the for. Must avoid this situation
	public int[] solutionInitial(int N, int[] A) {
		int[] counter = new int[N];
		int maxCounter = 0;
		for (int i = 0; i < A.length; i++) {
			if(A[i] > N) {
				for (int j = 0; j < counter.length; j++) { // Bad thing
					counter[j] = maxCounter;
				}
			} else {
				counter[A[i]-1] = counter[A[i]-1]+1;
				if(counter[A[i]-1] > maxCounter) {
					maxCounter = counter[A[i]-1];
				}
			}			
		}
		return counter;
	}

}
