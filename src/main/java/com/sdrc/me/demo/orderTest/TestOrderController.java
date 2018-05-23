package com.sdrc.me.demo.orderTest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestOrderController {
	@Autowired
	List<Car> cars;

	@RequestMapping("/")
	@ResponseBody
	public void getLastSavedData(){
		for(Car car : cars) {
         System.out.println("Hello - "+car.printCarName());
     }
		
	}
}
