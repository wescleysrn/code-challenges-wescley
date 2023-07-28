package com.iamandu.codechallenger.solutions.wescley.codility.countingelements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.iamandu.codechallenger.problems.codility.countingelements.FrogRiverOne;

@Component
@Profile("wescley")
public class FrogRiverOneImpl implements FrogRiverOne {

	// Score 100%
	@Override
	public int solution(int X, int[] A) {
        // the main ideas:
        // 1. create a "set", and put "1~X" into the set first.
        // 2. when a number matches a number in the set, 
        //    then remove the number from the set.
        // 3. when the set becomes "empty",
        //    all the numbers "1~X" have appeared
		Set<Integer> set = new HashSet<Integer>();
		// put "1~X" into the set first
        for(int i=1; i<= X; i++){
            set.add(i);
        }
        for(int i=0; i< A.length; i++){
            if( set.contains(A[i]) == true ){ // when a number appears,
                set.remove(A[i]);             // then, remove it from the set
            }
            if(set.isEmpty() == true){        // nothing in the set
                return i;                     // In second i, "1~X" have all appeared 
            }
        }
		return -1;
	}

	// score 54%
	public int solutionInitial(int X, int[] A) {
		int earliestTime = -1;
		int[] leavesPositions = new int[X+1];
		for (int i = 0; i < A.length; i++) {
			leavesPositions[A[i]] = A[i];
			if(Arrays.stream(Arrays.copyOfRange(leavesPositions, 1, leavesPositions.length))
					 .allMatch(element -> element != 0)) {
				earliestTime = i;
				break;
			}
		}
		return earliestTime;
	}

}
