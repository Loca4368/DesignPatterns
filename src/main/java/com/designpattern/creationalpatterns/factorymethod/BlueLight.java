package com.designpattern.creationalpatterns.factorymethod;

public class BlueLight extends Light {

	@Override
	void getColor() {
		lightColor = "Blue";
	}
}