/**
 * 
 */
package com.sdrc.me.demo.orderTest;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class CarHonda extends Car {
	
	@Override
	public String printCarName(){
		return "2 Honda Car";
	}

}
