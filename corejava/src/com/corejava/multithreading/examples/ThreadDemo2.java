package com.corejava.multithreading.examples;

public class ThreadDemo2 implements Runnable{
	
	public void run() {
		System.out.println("the run method is running...");
		
	}

	public static void main(String[] args) {
	  
		ThreadDemo2 t2 =new ThreadDemo2();
		
		Thread t = new Thread(t2);
		
		t.start();

	}

	

}
