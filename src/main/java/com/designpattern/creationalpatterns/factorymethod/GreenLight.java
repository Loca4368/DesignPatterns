package com.designpattern.creationalpatterns.factorymethod;

public class GreenLight extends Light {

	@Override
	void getColor() {
		lightColor = "Green";
	}
}