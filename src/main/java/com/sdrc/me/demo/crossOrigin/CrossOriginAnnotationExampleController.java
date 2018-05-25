package com.sdrc.me.demo.crossOrigin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * @CrossOrigin annotation can be used at the method level and also in the class level for handling cross origin problems.
 * In many scenario the host that serves the request and the host that serves the data is having different versions of javascript versions.
 * To solve this issue The Cross Origin Resource Sharing annotation is useful.
 * By default it supports the methods,all the headers and value that is mentioned in the @RequestMapping annotation.
 * The maxAge is default set to 30mins. we can customize these values.  
 * 
 * */
@Controller
public class CrossOriginAnnotationExampleController {
	
	@RequestMapping(value="testCross",method=RequestMethod.POST,headers={"content-type=text/html"},produces="Application/JSON")
	public void testCrossMethod(){
		
		System.out.println("Inside the Cross Get method");
	}
	
	@CrossOrigin(origins="www.fgghfhfhfgfh.co.in")
	@RequestMapping(value="testCross2",method=RequestMethod.GET)
	public void testCrossMethod2(){
		
		System.out.println("Inside the post method");
	}

}
