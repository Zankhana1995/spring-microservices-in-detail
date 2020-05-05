package com.demo.microservices.netflixzuulapigatewayserver;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulLoggingFilter extends ZuulFilter {

	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	@Override
	public boolean shouldFilter() {
		
		return true;
	}

	//log details of the requests
	@Override
	public Object run() throws ZuulException {
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		logger.info("The request -> {}, Request URI -> {}",request,request.getRequestURI());
		return null;
	}

	@Override
	public String filterType() {
		// options are 'pre', 'post, 'error'
		//pre: intercept all requests before executions
		return "pre";
	}

	@Override
	public int filterOrder() {
		
		return 1;
	}

}
