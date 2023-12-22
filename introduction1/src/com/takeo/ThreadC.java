package com.takeo;

public class ThreadC extends Thread{
	int total;
	
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			total=total+i;
		}
	}
}
