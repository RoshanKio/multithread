package com.takeo;

public class ThreadB extends Thread{
	
	int sum;
	
	private ThreadC threadC;
	
	public ThreadC getThreadC() {
		return threadC;
	}
	public void setThreadC(ThreadC threadC) {
		this.threadC = threadC;
	}
	
	public ThreadB(ThreadC threadC) {
		this.threadC = threadC;
	}
	
	
	
	@Override
	public void run() {
		threadC.start();
		
		try {
			threadC.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i = 1; i<=100; i++) {
			System.out.println(i+") The sum is "+threadC.total);
		}
		sum = threadC.total;
		for(int i = 1; i<=100; i++) {
			sum = sum+i;
		}
	}
	
}
