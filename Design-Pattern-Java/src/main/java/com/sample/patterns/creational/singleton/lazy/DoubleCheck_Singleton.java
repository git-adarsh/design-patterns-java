package com.sample.patterns.creational.singleton.lazy;

public class DoubleCheck_Singleton {
	private volatile static DoubleCheck_Singleton INSTANCE;

	private DoubleCheck_Singleton() {
		System.out.println("Instantiated...");
	}

	public static DoubleCheck_Singleton getInstance() {
		// using ref for performance reasons
		DoubleCheck_Singleton ref = INSTANCE;

		if (ref == null) { // first check
			synchronized (DoubleCheck_Singleton.class) {
				if (INSTANCE == null) // double check
					INSTANCE = new DoubleCheck_Singleton();
				ref = INSTANCE;

				// or a one-liner
				/* ref = INSTANCE == null ? INSTANCE = new DoubleCheck_Singleton() : INSTANCE; */
			}
		}
		return ref;
	}
}
