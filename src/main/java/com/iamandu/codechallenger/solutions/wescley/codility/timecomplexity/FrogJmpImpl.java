package com.iamandu.codechallenger.solutions.wescley.codility.timecomplexity;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.iamandu.codechallenger.problems.codility.timecomplexity.FrogJmp;

@Component
@Profile("wescley")
public class FrogJmpImpl implements FrogJmp {

	@Override
	public int solution(int X, int Y, int D) {
		return ((Y - X) + D - 1)/D; 
	}

}
