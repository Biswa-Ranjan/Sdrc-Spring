package com.sdrc.me.demo.cookieValue;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * This annotation is used at method parameter level. @CookieValue is used as argument
 * of request mapping method. The HTTP cookie is bound to the @CookieValue parameter 
 * for a given cookie name.
 * Let  JSESSIONID=418AB76CD83EF94U85YD34W
 * To get the value of the cookie, use @CookieValue like this:* 
 * 
 * */
@Controller
public class CookieValueExampleController {
	
	@RequestMapping(value="checkCookieValue")
	public void getCookieValue(@CookieValue(value="JSESSIONID",required=false)  String jsesssionId ){
		
		System.out.println("Inside cookie value method"+jsesssionId);
	}

}
