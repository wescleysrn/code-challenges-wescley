package com.iamandu.codechallenger.solutions.wescley.codility.prefixsums;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.iamandu.codechallenger.problems.codility.prefixsums.PassingCars;

@Component
@Profile("wescley")
public class PassingCarsImpl implements PassingCars {

	// Score 100%
	@Override
	public int solution(int[] A) {
		
        // note: find number of pairs (P, Q)
        // where P < Q (important)
        // try to use "one pass" solution (low time complexity)
        
        int num_east = 0; // initial
        int num_pass = 0; // initial
        
        for(int i=0; i<A.length; i++){
            if(A[i] ==0){ // to east
                num_east++;
            }
            if(A[i] ==1){ // to west
                num_pass = num_pass + num_east;
            }
            // note: just look back "num_east" 
            //       that will be the number of cars can be paired 
            //       (with the current car)
        }
        
        // note 1: can use "_" for a big value
        // note 2: "num_pass < 0" is for the "overflow" cases
        //         when "overflow" occurs, the value will "< 0" (important)
        if(num_pass > 1_000_000_000 || num_pass < 0) 
            return -1;
        else
            return num_pass;
	}

	// Score 50%
	public int solutionInitial(int[] A) {
		Set<Integer> passingCarsEast = new HashSet<>();
		Set<Integer> passingCarsWest = new HashSet<>();
		int pairsPassingCars = 0;
		for (int i = 0; i < A.length; i++) {
			if(A[i] == 0) {
				passingCarsEast.add(i);
			} else {
				passingCarsWest.add(i);
			}
		}
		for (Integer toEast : passingCarsEast) {
			pairsPassingCars += 
					(passingCarsWest.stream()
									.filter(carIndex -> carIndex > toEast)
									.collect(Collectors.counting()));
		}
		return pairsPassingCars;
	}
	
}
