package com.corejava.multithreading.examples;

public class ThreadDemo3 extends Thread{
	
	public void run(){
		
		for(int i=0;i<=5;i++){
			
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){System.out.println(e);}
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		
		ThreadDemo3 t3 = new ThreadDemo3();
		
		ThreadDemo3 t4 = new ThreadDemo3();
		
		/*t3.start();
		t4.start();*/
		
		t3.run();
		t4.run();

	}

}
