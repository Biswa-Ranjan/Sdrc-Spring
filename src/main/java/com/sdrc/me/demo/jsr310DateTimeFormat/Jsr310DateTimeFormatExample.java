package com.sdrc.me.demo.jsr310DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Jsr310DateTimeFormatExample {

	@DateTimeFormat(iso =ISO.DATE)
	private LocalDate localDate;
	@DateTimeFormat(iso=ISO.TIME)
	private LocalTime localTime;
	@DateTimeFormat(iso=ISO.TIME)
	private OffsetTime offsetTime;
	@DateTimeFormat(iso=ISO.TIME)
	private LocalDateTime localDateTime;
	@DateTimeFormat(iso=ISO.TIME)
	private ZonedDateTime zonedDateTime;
	@DateTimeFormat(iso=ISO.TIME)
	private OffsetDateTime offsetDateTime;
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	public LocalTime getLocalTime() {
		return localTime;
	}
	public void setLocalTime(LocalTime localTime) {
		this.localTime = localTime;
	}
	public OffsetTime getOffsetTime() {
		return offsetTime;
	}
	public void setOffsetTime(OffsetTime offsetTime) {
		this.offsetTime = offsetTime;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	public ZonedDateTime getZonedDateTime() {
		return zonedDateTime;
	}
	public void setZonedDateTime(ZonedDateTime zonedDateTime) {
		this.zonedDateTime = zonedDateTime;
	}
	public OffsetDateTime getOffsetDateTime() {
		return offsetDateTime;
	}
	public void setOffsetDateTime(OffsetDateTime offsetDateTime) {
		this.offsetDateTime = offsetDateTime;
	}
	
}
