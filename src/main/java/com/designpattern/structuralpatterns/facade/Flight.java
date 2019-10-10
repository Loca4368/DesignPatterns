package com.designpattern.structuralpatterns.facade;

import java.util.Date;

public class Flight {

	public Flight getHotelsFor(Date from, Date to) {
		return new Flight();
	}
}