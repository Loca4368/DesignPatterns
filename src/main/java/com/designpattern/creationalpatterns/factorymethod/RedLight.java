package com.designpattern.creationalpatterns.factorymethod;

public class RedLight extends Light {

	@Override
	void getColor() {
		lightColor = "Red";
	}
}