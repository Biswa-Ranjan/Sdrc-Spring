package com.sdrc.me.demo.qualifierTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestQualifierController {
/*Description:

## problem statement error 
Field vehicle in com.sdrc.me.demo.qualifierTest.TestQualifierController required a bean 
of type 'com.sdrc.me.demo.qualifierTest.Vehicle' that could not be found.

 * 
 * */
	@Autowired
	@Qualifier("vehicleTruck")
	Vehicle vehicle;
	
	@RequestMapping("/qualifier")
	public void checkVehicle(){

		System.out.println("Inside Controller checkVehicle method");
		vehicle.start();
		vehicle.stop();
		
	}
	
	@Autowired
	@Qualifier("vehicleBus")
	Vehicle vehicleOne;
	@RequestMapping("/qualifier1")
	public void checkVehicleOne(){
		
		System.out.println("Inside Controller checkVehicleOne method");
		vehicleOne.start();
		vehicleOne.stop();
	}
	
}
