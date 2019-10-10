package com.designpattern.creationalpatterns.singleton;

public class SingletonLazyInstatiation {

	/*
	 * Static member
	 * It gets memory only once and it contains the instance of Singleton class.
	 */
	private static SingletonLazyInstatiation instance;

	/*
	 * Private Constructor
	 * It prevents to instantiate the Singleton class from outside the class.
	 */
	private SingletonLazyInstatiation() {
	};

	/*
	 * Static factory method
	 * This provides the global point of access to the Singleton object
	 * and returns the instance to the caller.
	 * 
	 * Use synchronized to achieve "Lazy Instantiation"
	 */
	public static synchronized SingletonLazyInstatiation getInstance() {
		if (instance == null) {
			instance = new SingletonLazyInstatiation();
		}
		return instance;
	}

	/*
	 * Sample method
	 */
	public void getInfo() {
		System.out.println("Singleton instance created using lazy instantiation.");
	}

}
