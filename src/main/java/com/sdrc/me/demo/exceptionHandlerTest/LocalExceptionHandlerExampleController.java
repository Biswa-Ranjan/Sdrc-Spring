package com.sdrc.me.demo.exceptionHandlerTest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
public class LocalExceptionHandlerExampleController {

	/*
	 * @ExceptionHandler works at the Controller level and 
	 * it is only active for that particular Controller, 
	 * not globally for the entire application.It is local to a controller.
	 * This exception handler is only limited to LocalExceptionHandlerExampleController
	 * if same exception arises in other controller then we have to write the code there also 
	 * */
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Map<Integer, String>> testMethodException(){
		System.out.println("Inside Test Method");
		Map<Integer,String> map=new HashMap<Integer,String>();
		int num=9/0; //ArithmeticException occurs
		map.put(num,"Hello");		
		System.out.println(num);
		return new ResponseEntity<Map<Integer, String>>(map,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
