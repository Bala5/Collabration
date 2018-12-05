package com.niit.UcMiddle.Config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.niit.UcBack.DBConfig;

public class DispatcherServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("in dispacher servlet tag 1");
		return new Class[] {DBConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("in dispacher servlet tag 2");
		return new Class[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("in dispacher servlet tag 3");
		return new String[] {"/"};
	}
	
}
