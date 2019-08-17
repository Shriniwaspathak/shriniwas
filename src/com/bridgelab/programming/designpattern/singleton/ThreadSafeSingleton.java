package com.bridgelab.programming.designpattern.singleton;

public class ThreadSafeSingleton {
	public static ThreadSafeSingleton instance;

	ThreadSafeSingleton() {
	}

	public static ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();

		}
		return instance;
	}

//double locking
	public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
}