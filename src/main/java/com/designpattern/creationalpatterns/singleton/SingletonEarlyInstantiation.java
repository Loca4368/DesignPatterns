package com.designpattern.creationalpatterns.singleton;

public class SingletonEarlyInstantiation {

	/*
	 * Static member
	 * It gets memory only once and it contains the instance of Singleton class.
	 * 
	 * Instance will be created at load time
	 */
	private static SingletonEarlyInstantiation instance = new SingletonEarlyInstantiation();

	/*
	 * Private Constructor
	 * It prevents to instantiate the Singleton class from outside the class.
	 */
	private SingletonEarlyInstantiation() {
	}

	/*
	 * Static factory method
	 * This provides the global point of access to the Singleton object
	 * and returns the instance to the caller.
	 */
	public static SingletonEarlyInstantiation getInstance() {
		return instance;
	}

	/*
	 * Sample method
	 */
	public void getInfo() {
		System.out.println("Singleton instance created using early instantiation.");
	}
}
