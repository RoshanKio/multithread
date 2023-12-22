package com.takeo;

public class ThreadA {
	
	public static void main(String ... st) {
		ThreadC threadC = new ThreadC();
		ThreadB threadB = new ThreadB(threadC);
		threadB.start();
		try {
			threadB.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("threadB.sum = "+threadB.sum+" from Main thread.");
	}

}
