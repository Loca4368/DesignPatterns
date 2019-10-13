package com.designpattern.creationalpatterns.factorymethod;

public class FactoryMethodPatternClient {

	public static void main(String[] args) {

		LightFactory lightFactory = new LightFactory();

		Light blueLight = lightFactory.getLight("Blue");
		blueLight.getColor();
		blueLight.show();

		Light redLight = lightFactory.getLight("Red");
		redLight.getColor();
		redLight.show();

		Light greenLight = lightFactory.getLight("Green");
		greenLight.getColor();
		greenLight.show();
	}
}