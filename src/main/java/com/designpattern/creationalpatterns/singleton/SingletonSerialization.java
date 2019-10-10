package com.designpattern.creationalpatterns.singleton;

import java.io.Serializable;

public class SingletonSerialization implements Serializable {

	private static SingletonSerialization instance;

	private SingletonSerialization() {
	}

	public static synchronized SingletonSerialization getInstance() {
		if (instance == null) {
			instance = new SingletonSerialization();
		}
		return instance;
	}

	/*
	 * If singleton class is Serializable, we can serialize the singleton instance.
	 * Once it is serialized, it can be deserialized, but it will not return the singleton object.
	 * To resolve this issue, we need to override the readResolve() method that enforces the singleton.
	 * It is called just after the object is deserialized. It returns the singleton object.
	 */
	protected SingletonSerialization readResolve() {
		return instance;
	}

}
