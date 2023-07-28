package com.iamandu.codechallenger.solutions.wescley.codility.prefixsums;

import java.util.stream.IntStream;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.iamandu.codechallenger.problems.codility.prefixsums.CountDiv;

@Component
@Profile("wescley")
public class CountDivImpl implements CountDiv {

	// Score 100%
	@Override
	public int solution(int A, int B, int K) {
		// need to achieve low complexity O(1)
        // using math equation (low complexity)
        
        // number of divisible values smaller than B
        int num_B = (int) Math.floor( B/K );
        // note: take "Math.floor" which is the basic number
        
        // number of divisible values smaller than A
        int num_A = (int) Math.floor( A/K );
        // note: take "Math.floor" which is the basic number
        
        // number of divisible numbers
        int num_div = num_B - num_A;
        
        // note: plus one (if A % K == 0)
        // because "A" is also divisble 
        // without "plus", "A" will be deducted
        int plus = 0;
        if(A % K == 0)
            plus = 1;
            
        // num_div + plus
        num_div = num_div + plus;
        
        // return the number of K-divisible values between A and B
        return num_div;
	}

	// Score 12%
	public int solutionInitial(int A, int B, int K) {
		return Math.toIntExact(IntStream.range(A, B).boxed().filter(num -> (num % K) == 0).count());
	}

	// Score 100%
	public int solutionOther1(int A, int B, int K) {
		if (A == 0) {
            return (B / K) + 1;
        } else {
            return (B / K) - ((A - 1) / K);
        }
	}
	
}
