package com.corejava.multithreading.examples;

public class ThreadDemo4 extends Thread{
	  
		 public void run(){  
		  for(int i=1;i<=5;i++){  
		   try{  
		    Thread.sleep(500);  
		   }catch(Exception e){System.out.println(e);}  
		  System.out.println(i);  
		  }  
		 }  
		public static void main(String args[]){  
			ThreadDemo4 t1=new ThreadDemo4();  
			ThreadDemo4 t2=new ThreadDemo4();  
			ThreadDemo4 t3=new ThreadDemo4();  
		 t1.start();  
		 try{  
		  t1.join(2000);  
		 }catch(Exception e){System.out.println(e);}  
		  
		 t2.start();  
		 t3.start();  
		 }  
		}  


