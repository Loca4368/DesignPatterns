package com.designpattern.structuralpatterns.facade;

public class Nokia implements Mobile {

	@Override
	public void modelNo() {
		System.out.println(" Noika 100 ");

	}

	@Override
	public void price() {
		System.out.println(" $ 800 ");

	}
}