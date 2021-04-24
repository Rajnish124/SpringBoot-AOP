package com.sam.springaop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.springaop.dao.Dao2;

@Service
public class Business2 {

	@Autowired
	private Dao2 dao2;
	
	public String calculateSomething()
	{
		return dao2.retriveSomething();
	}
}
