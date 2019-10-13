package com.designpattern.structuralpatterns.facade;

public class Iphone implements Mobile {

	@Override
	public void modelNo() {
		System.out.println(" Iphone 6 ");
	}

	@Override
	public void price() {
		System.out.println(" $1000 ");
	}
}