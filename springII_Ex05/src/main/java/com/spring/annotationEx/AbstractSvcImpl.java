package com.spring.annotationEx;

import org.springframework.stereotype.Component;

@Component("service01")
public class AbstractSvcImpl implements AbstractSvc{
	private String name = "01";
	
	@Override
	public String getClassName() {
	
		return "AbstractSvcImpl - "+name;
	}
	
}
