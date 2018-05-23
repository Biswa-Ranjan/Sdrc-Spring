package com.sdrc.me.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sdrc.me.demo.orderTest.Car;

@SpringBootApplication
public class SpringSdrcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSdrcApplication.class, args);
		System.out.println("abcd");
		System.out.println("1234");
		System.out.println("345345");
	}
	@Autowired
    List<Car> cars;

    public void printNames(String [] args) {

        for(Car car : cars) {
            System.out.println(car.printCarName());
        }
    }
	
}
