/**
 * 
 */
package com.sdrc.me.demo.orderTest;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class CarToyota extends Car{
	@Override
	public String printCarName(){
		return "1 toyota Car";
	}
}
