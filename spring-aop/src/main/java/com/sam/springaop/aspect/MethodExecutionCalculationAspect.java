package com.sam.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MethodExecutionCalculationAspect {

	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Around("execution(* com.sam.springaop.service.*.*(..))")
	public void around(ProceedingJoinPoint jointPoint) throws Throwable
	
	{
		
		long starttime=System.currentTimeMillis();
		jointPoint.proceed();
		long timetaken=System.currentTimeMillis()-starttime;
		logger.info("Time taken by {} is {}", jointPoint,timetaken);
		
	}
	
	
}
