package com.sdrc.me.demo.jsr310DateTimeFormat;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Jsr310TimeOperations {
	
//	Getting current time
	// Old
	/*Date now90 = new Date();*/	 
	// New
	ZonedDateTime now91 = ZonedDateTime.now();

// Representing specific time
	// Old
	/*Date birthDay90 = new GregorianCalendar(1990, Calendar.DECEMBER, 15).getTime();*/
	// New
	LocalDate birthDay91 = LocalDate.of(1990, Month.DECEMBER, 15);
	
//	Extracting specific fields
	// Old
/*	int month90 = new GregorianCalendar().get(Calendar.MONTH);*/
	// New
	Month month91 = LocalDateTime.now().getMonth();

//	Adding and subtracting time
	// Old
/*	GregorianCalendar calendar80 = new GregorianCalendar();
	calendar.add(Calendar.HOUR_OF_DAY, -5);
	
	Date fiveHoursBefore90 = calendar80.getTime();
*/	 
	// New
	LocalDateTime fiveHoursBefore91 = LocalDateTime.now().minusHours(5);
	
	/*Altering specific fields*/
	// Old
	/*GregorianCalendar calendar = new GregorianCalendar();
	calendar.set(Calendar.MONTH, Calendar.JUNE);
	Date inJune1 = calendar.getTime();*/
	 
	// New
	LocalDateTime inJune2 = LocalDateTime.now().withMonth(Month.JUNE.getValue());

	/*Truncating
	Truncating resets all time fields smaller than the specified field. 
	In the example below minutes and everything below will be set to zero*/

	// Old
	/*Calendar now7 = Calendar.getInstance();
	now7.set(Calendar.MINUTE, 0);
	now7.set(Calendar.SECOND, 0);
	now7.set(Calendar.MILLISECOND, 0);
	Date truncated22 = now7.getTime();
	*/ 
	// New
	LocalTime truncated11 = LocalTime.now().truncatedTo(ChronoUnit.HOURS);
	
	/*Time zone conversion*/
	// Old
	/*GregorianCalendar calendar = new GregorianCalendar();
	calendar.setTimeZone(TimeZone.getTimeZone("CET"));
	Date centralEastern = calendar.getTime();
	*/ 
	// New
	ZonedDateTime centralEastern = LocalDateTime.now().atZone(ZoneId.of("CET"));

/*	Getting time span between two points in time*/
	// Old
	/*GregorianCalendar calendar = new GregorianCalendar();
	Date now = new Date();
	calendar.add(Calendar.HOUR, 1);
	Date hourLater = calendar.getTime();
	long elapsed = hourLater.getTime() - now.getTime();
	*/ 
	// New
	LocalDateTime now22 = LocalDateTime.now();
	LocalDateTime hourLater = LocalDateTime.now().plusHours(1);
	Duration span = Duration.between(now22, hourLater);

	/*Time formatting and parsing*/

	/*DateTimeFormatter is a replacement for the old SimpleDateFormat that is thread-safe and provides additional functionality.*/
	// Old
	/*SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date now = new Date();
	String formattedDate = dateFormat.format(now);
	Date parsedDate = dateFormat.parse(formattedDate);
	*/ 
	// New
	LocalDate now33 = LocalDate.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	String formattedDate = now33.format(formatter);
	LocalDate parsedDate = LocalDate.parse(formattedDate, formatter);

/*	Number of days in a month*/
	// Old
/*	Calendar calendar = new GregorianCalendar(1990, Calendar.FEBRUARY, 20);
	int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
*/	 
	// New
	int daysInMonth = YearMonth.of(1990, 2).lengthOfMonth();


}
