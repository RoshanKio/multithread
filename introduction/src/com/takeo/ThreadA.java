package com.takeo;

public class ThreadA {

	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		
		b.start();
		try {
		Thread.sleep(10000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(b.total);

	}

}
