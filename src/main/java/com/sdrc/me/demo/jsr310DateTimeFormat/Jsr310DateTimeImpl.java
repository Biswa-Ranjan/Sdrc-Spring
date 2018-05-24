package com.sdrc.me.demo.jsr310DateTimeFormat;

import org.springframework.beans.factory.annotation.Autowired;

public class Jsr310DateTimeImpl {
	
	@Autowired
	 java.time.LocalDate localDate;
	@Autowired
	java.time.LocalDateTime localDateTime;
	@Autowired
	 java.time.LocalTime localTime;
	@Autowired
	 java.time.OffsetDateTime offsetDateTime;
	@Autowired
	 java.time.OffsetTime offsetTime;
	@Autowired
	 java.time.ZonedDateTime zonedDateTime;
	
	
	
	public static void main(String[] args) {
		System.out.println("inside main");
		Jsr310DateTimeImpl jsr310=new Jsr310DateTimeImpl();
		
		jsr310.prinTFunction();
		
	}
	
	public void prinTFunction(){
		Jsr310DateTimeFormatExample jdt = new Jsr310DateTimeFormatExample();
		jdt.setLocalDate(localDate.now());
		jdt.setLocalTime(localTime.now());
		jdt.setOffsetTime(offsetTime.now());
		jdt.setOffsetDateTime(offsetDateTime.now());
		jdt.setZonedDateTime(zonedDateTime.now());
		jdt.setLocalDateTime(localDateTime.now());
		
		System.out.println("jdt.getLocalDate() -> "+jdt.getLocalDate());
		System.out.println("jdt.getLocalTime() -> "+jdt.getLocalTime());
		System.out.println("jdt.getOffsetTime() -> "+jdt.getOffsetTime());
		System.out.println("jdt.getOffsetDateTime() -> "+jdt.getOffsetDateTime());
		System.out.println("jdt.getZonedDateTime() -> "+jdt.getZonedDateTime());
		System.out.println("jdt.getLocalDateTime() -> "+jdt.getLocalDateTime());
		
	}

}
