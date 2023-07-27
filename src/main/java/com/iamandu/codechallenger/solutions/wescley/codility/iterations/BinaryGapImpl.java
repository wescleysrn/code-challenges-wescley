package com.iamandu.codechallenger.solutions.wescley.codility.iterations;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.iamandu.codechallenger.problems.codility.iterations.BinaryGap;

@Component
@Profile("wescley")
public class BinaryGapImpl implements BinaryGap {

	@Override
	public int binaryGap(int N) {
		char[] binNumber = Integer.toBinaryString(N).toCharArray();
		int longestBinary = 0;
		int gap = 0;
		for (int i = 0; i < binNumber.length; i++) {
			if(binNumber[i] == '1' && gap > 0 && gap > longestBinary) {
				longestBinary = gap;
				gap = 0;
			} else if(binNumber[i] == '1') {
				gap = 0;			
			} else if(binNumber[i] == '0') {
				++gap;
			}
		}
		return longestBinary;
	}

}
