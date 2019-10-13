package com.designpattern.structuralpatterns.facade;

public class Huawei implements Mobile {

	@Override
	public void modelNo() {
		System.out.println(" Huawei M30 ");
	}

	@Override
	public void price() {
		System.out.println(" $1500 ");
	}
}
