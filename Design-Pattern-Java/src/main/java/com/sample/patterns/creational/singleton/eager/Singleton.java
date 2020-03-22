package com.sample.patterns.creational.singleton.eager;

public class Singleton {
	private static final Singleton INSTANCE = new Singleton();

	// cannot access outside this class
	private Singleton() {

	}

	public static Singleton getInstance() {
		return INSTANCE;
	}
}
