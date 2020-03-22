package com.sample.patterns;

import com.sample.patterns.creational.singleton.lazy.DoubleCheck_Singleton;
import com.sample.patterns.creational.singleton.lazy.StaticInnerHolder_Singleton;

public class App {
	public static void main(String[] args) {

		/*
		 * Thread t1 = new Thread(() -> StaticInnerHolder_Singleton.getInstance());
		 * Thread t2 = new Thread(() -> StaticInnerHolder_Singleton.getInstance());
		 */

		Thread t1 = new Thread(() -> DoubleCheck_Singleton.getInstance());
		Thread t2 = new Thread(() -> DoubleCheck_Singleton.getInstance());

		t1.start();
		t2.start();

	}
}
