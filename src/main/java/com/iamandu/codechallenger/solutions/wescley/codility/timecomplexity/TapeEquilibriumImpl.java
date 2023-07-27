package com.iamandu.codechallenger.solutions.wescley.codility.timecomplexity;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.iamandu.codechallenger.problems.codility.timecomplexity.TapeEquilibrium;

@Component
@Profile("wescley")
public class TapeEquilibriumImpl implements TapeEquilibrium {

	// score 100%
	@Override
	public int solution(int[] A) {
		int length=A.length;
		long sum=0,currentSum=0;
		int minValue=Integer.MAX_VALUE, currentMinValue=0;
		for(int i=0;i<length;i++) {
			sum+=A[i];
		}
		currentSum=A[0];
		for(int j=1;j<length;j++) {
			currentMinValue=(int) Math.abs(currentSum-(sum-currentSum));
			if(currentMinValue<minValue)
				minValue=currentMinValue;
			currentSum+=A[j];
		}		
		return minValue;
	}

	// score 15%
	public int solutionInitial(int[] A) {
		int minDiff = Integer.MAX_VALUE;
		int PMax = Collections.max(Arrays.stream(A).boxed().collect(Collectors.toList()));
		for (int i = 1; i < PMax; i++) {
			int sumPartA = IntStream.of(Arrays.copyOfRange(A, 0, i)).sum();
			int sumPartB = IntStream.of(Arrays.copyOfRange(A, i, A.length)).sum();;
			if( Math.abs((sumPartA-sumPartB)) < minDiff) {
				minDiff = Math.abs(sumPartA-sumPartB);
			}
		}
		return minDiff;
	}

}
