package com.sdrc.me.demo.allRequestMappingVariants;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * @RequestMapping annotation is used to map web requests into specific handler 
 * classes and handler methods.When used in class level it creates a base URI
 *  for which the controller will be used.When used at method level it creates
 *  URI on which handler methods will be used.* 
 * 
 * */
@Controller
@RequestMapping(value="testRequestMapping")
public class RequestMappingExampleController {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> testMethod1(){
		System.out.println("Inside Get method");
		return new ResponseEntity<Object>(null,HttpStatus.OK);
	}
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<?> testMethod2(){
		System.out.println("Inside Post Method");
		return new ResponseEntity<Object>(null,HttpStatus.OK);
	}
}
