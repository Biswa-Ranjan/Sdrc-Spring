/**
 * 
 */
package com.sdrc.me.demo.orderTest;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class CarFord extends Car{
	
	@Override	
	public String printCarName(){
		return "3 Ford Car";
	}

}
