package com.designpattern.creationalpatterns.singleton;

public class SingletonDemo {

	public static void main(String [] args) {
		
		SingletonEarlyInstantiation singletonEarlyInstantiation = SingletonEarlyInstantiation.getInstance();
		singletonEarlyInstantiation.getInfo();
		
		SingletonLazyInstatiation singletonLazyInstatiation = SingletonLazyInstatiation.getInstance();
		singletonLazyInstatiation.getInfo();
		
	}
}
