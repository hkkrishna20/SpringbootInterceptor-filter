package com.spring.test.view.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class MyCustomInterceptor  extends HandlerInterceptorAdapter implements HandlerInterceptor {
	private static final Logger logger = LoggerFactory.getLogger(MyCustomInterceptor.class);

	// unimplemented methods comes here. Define the following method so that it
	// will handle the request before it is passed to the controller.

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("MINIMAL: INTERCEPTOR preHandle CALLED");
		
		String x = request.getMethod();
		logger.info(x + "intercepted");
		long startTime = System.currentTimeMillis();
	    request.setAttribute("executionTime", startTime);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("MINIMAL: INTERCEPTOR POSTHANDLE CALLED");
		logger.info("Post handle method - check execution time of handling");
	    long startTime = (Long) request.getAttribute("executionTime");
	    logger.info("Execution time for handling the request was: {} ms",
	      System.currentTimeMillis() - startTime);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception exception) throws Exception {
		System.out.println("MINIMAL: INTERCEPTOR AFTERCOMPLETION CALLED");
		logger.info("Post handle method - check execution time of handling");
	    long startTime = (Long) request.getAttribute("executionTime");
	    logger.info("Execution time for handling the request was: {} ms",
	      System.currentTimeMillis() - startTime);
	}
}
