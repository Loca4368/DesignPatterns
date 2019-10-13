package com.designpattern.creationalpatterns.factorymethod;

public class LightFactory {

	/**
	 * Method to get light
	 * 
	 * @param lightColor
	 * @return
	 */
	public Light getLight(String lightColor) {

		if (lightColor == null) {
			return null;
		}
		if (lightColor.equalsIgnoreCase("Red")) {
			return new RedLight();
		} else if (lightColor.equalsIgnoreCase("Green")) {
			return new GreenLight();
		} else if (lightColor.equalsIgnoreCase("Blue")) {
			return new BlueLight();
		}
		return null;
	}
}
