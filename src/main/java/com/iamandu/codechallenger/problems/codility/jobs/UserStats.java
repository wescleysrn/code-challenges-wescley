package com.iamandu.codechallenger.problems.codility.jobs;

import java.util.Optional;

public class UserStats {

	public UserStats(Long visit) {
		setVisitCount(Optional.of(visit));
	}
	
	private Optional<Long> visitCount;

	public Optional<Long> getVisitCount() {
		return visitCount;
	}

	public void setVisitCount(Optional<Long> visitCount) {
		this.visitCount = visitCount;
	}
	
}
