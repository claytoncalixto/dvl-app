package com.dvlcube.app.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public interface StatsAspect {

	static Object timeAround(ProceedingJoinPoint point) {
		return null;
	}

}
