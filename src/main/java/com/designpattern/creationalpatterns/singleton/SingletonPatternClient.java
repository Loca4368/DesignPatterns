package com.designpattern.creationalpatterns.singleton;

public class SingletonPatternClient {

	public static void main(String [] args) {
		
		SingletonEarlyInstantiation singletonEarlyInstantiation = SingletonEarlyInstantiation.getInstance();
		singletonEarlyInstantiation.getInfo();
		
		SingletonLazyInstatiation singletonLazyInstatiation = SingletonLazyInstatiation.getInstance();
		singletonLazyInstatiation.getInfo();
		
	}
}
