package com.corejava.multithreading.examples;

public class ThreadDemo1 extends Thread{
	
	public void run(){
		
		System.out.println("the run method is executing....");
	}

	public static void main(String[] args) {
		
		ThreadDemo1 t1= new ThreadDemo1();
		t1.start();
		

	}

}
