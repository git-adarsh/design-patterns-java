package com.sample.patterns.creational.singleton.lazy;

public class StaticInnerHolder_Singleton {

	private StaticInnerHolder_Singleton() {
		System.out.println("Instantiated...");
	}

	// Thread safe
	private static class LazyHolder {
		final static StaticInnerHolder_Singleton INSTANCE = new StaticInnerHolder_Singleton();
	}

	public static StaticInnerHolder_Singleton getInstance() {
		return LazyHolder.INSTANCE;
	}
}
