package com.challenge.codeinterview.solutions.wescley.codility.arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.challenge.codeinterview.problems.codility.arrays.OddOccurrencesInArray;

@Component
@Profile("wescley")
public class OddOccurrencesInArrayImpl implements OddOccurrencesInArray {

	// score 100%
	@Override
	public int solution(int[] A) {
		// Using the concept of "XOR" (^)
        // when there is a pair A and B 
        // A^B will be zero 
        // A^B^C (where C is not paired), 
        // then A^B^C = C
		if(A.length == 0)
            return 0;
		int unpaired = 0;
	    for (int num : A) {
	    	// Using bit operation.
	    	unpaired ^= num;
	    }
	    return unpaired;
	}

	// score 44%
	public int solutionInitial(int[] A) {
		Stream<Integer> streamOddNumber = IntStream.of(A).boxed();
		Map<Integer, Long> mapOccurence = 		
		streamOddNumber.parallel()
					   .collect(
								 Collectors.groupingBy(Function.identity(),
								 Collectors.counting())
					   );
		return Collections.min(mapOccurence.entrySet(),
                			   Comparator.comparing(Entry::getValue)).getKey();
	}

}
