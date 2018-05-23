package com.sdrc.me.demo.qualifierTest;

import org.springframework.stereotype.Component;

@Component
public class VehicleTruck implements Vehicle{

	@Override
	public void start() {
		
		System.out.println("Truck Started");
	}

	@Override
	public void stop() {
		
		System.out.println("Truck Stopped");
	}

}
