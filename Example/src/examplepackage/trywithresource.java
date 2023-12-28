package examplepackage;

import java.io.FileOutputStream;

public class trywithresource extends Thread{  
	public void run(){  
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[]){  
			trywithresource m1=new trywithresource();  
		Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
		t1.start();  
		 }  
		} 