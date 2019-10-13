package com.designpattern.creationalpatterns.factorymethod;

public abstract class Light {

	protected String lightColor;

	abstract void getColor();

	public void show() {
		System.out.println("The color is light is " + lightColor);
	}
}