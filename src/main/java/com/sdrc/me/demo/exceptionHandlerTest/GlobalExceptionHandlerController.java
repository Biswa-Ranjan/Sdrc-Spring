package com.sdrc.me.demo.exceptionHandlerTest;

import java.nio.file.ProviderNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/*
 * @ControllerAdvice is like one stop destination for all the exception handling in the project 
 * as we can capture all the exceptions that are occurs in this controller and the rest controller.
 * This can catch exceptions from any place like dao,repository,service,controllers layers etc.
 * used for global error handling in the Spring MVC application .
 * It also has full control over the body of the response and the status code. 
 * @controllerAdvice is having two main properties those are basePackageClasses and basePackages
 * where we can customize our classes and packages where we can catach exceptions. 
 * 
 * If both are present in the code then the local with take precedence over the global one.
 * Ideally the @ControllerAdvice option is a better one as we need not add the code in 
 * each and every controller class 
 * */
@ControllerAdvice(basePackages="com.sdrc.me.demo")
public class GlobalExceptionHandlerController {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Map<Integer, String>> testGlobalExcption(){
		System.out.println("inside the global exception handler method");
		Map<Integer,String> map=new HashMap<Integer,String>();
		int num=8/0; //ArithmeticException occurs
		map.put(num, "test");		
		System.out.println(num);
		return new ResponseEntity<Map<Integer, String>>(map,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(ProviderNotFoundException.class)
	  public ResponseEntity<ProviderNotFoundException> notFoundException(final ProviderNotFoundException e) {
	    return new ResponseEntity<ProviderNotFoundException>(e, HttpStatus.NOT_FOUND);
	  }
	
	@ExceptionHandler(IllegalArgumentException.class)
	  public ResponseEntity<IllegalArgumentException> assertionException(final IllegalArgumentException e) {
	    return new ResponseEntity<IllegalArgumentException>(e, HttpStatus.NOT_FOUND);
	  }
	
}
