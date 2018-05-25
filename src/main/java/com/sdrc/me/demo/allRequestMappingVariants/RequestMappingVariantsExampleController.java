package com.sdrc.me.demo.allRequestMappingVariants;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class RequestMappingVariantsExampleController {

	/*
	 * @GetMapping is combination of @RequestMapping and method Type="GET"
	 * it is a meta annotation 
	 * */
	@GetMapping(value="testGet")
	public void getMappingExampleMethod(){
		System.out.println("inside get Mapping method");
	}
	/*
	 * @PostMapping is combination of @RequestMapping and method Type="POST"
	 * it is a meta annotation 
	 * */
	@PostMapping(value="testPost")
	public void postMappingExampleMethod(){
		System.out.println("inside post mapping method");
		
	}
	/*
	 * @PutMapping is combination of @RequestMapping and method Type="PUT"
	 * it is a meta annotation 
	 * */
	@PutMapping(value="testPut")
	public void putMappingExampleMethod(){
		System.out.println("inside put mapping method");
		
	}
	/*
	 * @DeleteMapping is combination of @RequestMapping and method Type="DELETE"
	 * it is a meta annotation 
	 * */
	@DeleteMapping(value="testDelete")
	public void deleteMappingExampleMethod(){
		System.out.println("inside delete mapping method");
	}
}
