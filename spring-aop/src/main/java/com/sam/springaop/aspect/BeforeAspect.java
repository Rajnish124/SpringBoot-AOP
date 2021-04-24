package com.sam.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
//AOP
//Configuration

@Aspect
@Component
public class BeforeAspect {

	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	// what kind of method calls would i interperate
	//executon(* PACAKAGE.*.*(..))
	//point cut
	/*@Before(value="execution(* com.sam.springaop.service.*.*(..))")
	public void Before(JoinPoint joinPoint) {
		
		//Advice
		logger.info("check for the user access");
		logger.info("intercepted method calls-{}",joinPoint);
		
	}*/
	
	/*@AfterReturning(value="execution(* com.sam.springaop.service.*.*(..))",returning="result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		
		//Advice
		logger.info("check for the user access");
		logger.info("{} returned with value {}",joinPoint,result);
		
	}
	*/
	
	/*@AfterThrowing(value="execution(* com.sam.springaop.service.*.*(..))",throwing="exception")
	public void afterThrowing(JoinPoint joinPoint, Exception exception) {
		
		//Advice
		logger.info("check for the user access");
		logger.info("{} throw exception {}",joinPoint,exception);
		
	}*/
	
	@After(value="execution(* com.sam.springaop.service.*.*(..))")
	public void after(JoinPoint joinPoint) {
		
		//Advice
		logger.info("check for the user access");
		logger.info("after execution of {}",joinPoint);
		
	}
	
	
	
	
	
	
	
}
