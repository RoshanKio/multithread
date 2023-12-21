package com.takeo;

public class ThreadA1 {
	
	public static void main(String ...tr) {
		ThreadB b = new ThreadB();
		b.start();
		try {
			b.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(b.total);
		
	}

}
