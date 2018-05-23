package com.sdrc.me.demo.qualifierTest;

import org.springframework.stereotype.Component;

@Component
public class VehicleBus implements Vehicle
{

	@Override
	public void start() {

		System.out.println("Bus started");		
	}

	@Override
	public void stop() {

		System.out.println("Bus stopped");
	}

}
