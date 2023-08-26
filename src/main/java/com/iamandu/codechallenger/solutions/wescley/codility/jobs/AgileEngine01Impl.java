package com.iamandu.codechallenger.solutions.wescley.codility.jobs;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.iamandu.codechallenger.problems.codility.jobs.AgileEngine01;
import com.iamandu.codechallenger.problems.codility.jobs.UserStats;

@Component
@Profile("wescley")
public class AgileEngine01Impl implements AgileEngine01 {

	@SuppressWarnings("unchecked")
	@Override
	public Map<Long, Long> count(Map<String, UserStats>... visits) {

		if(visits == null) return new HashMap<Long, Long>();
		
		Map<Long, Long> counted = new HashMap<Long, Long>();
		
		for (int i = 0; i < visits.length; i ++) {
			Map<Long, Long> hashEntries = visits[i].entrySet().stream().collect(
				Collectors.toMap(
						entry -> Long.parseLong(entry.getKey()), 
						entry -> (entry.getValue() != null && entry.getValue().getVisitCount().isPresent() ? entry.getValue().getVisitCount().get() : 0) // get - Faltou no teste
				)
			);
			
			// Work too
//			counted.forEach((k, v) -> hashEntries.merge(k, v, (v1, v2) -> v1 + v2));
//			counted.putAll(hashEntries);
//			System.out.println(counted);
			
			counted = Stream.concat(counted.entrySet().stream(), hashEntries.entrySet().stream())
						    .collect(
						    		Collectors.groupingBy(Map.Entry::getKey,
						            Collectors.summingLong(Map.Entry::getValue))
						    );
			
		}

		return counted;

	}


}
