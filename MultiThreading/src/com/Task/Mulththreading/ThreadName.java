package com.Task.Mulththreading;

public class ThreadName {

	public static void main(String[] args) {
		
		System.out.println("Hello eveyone");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Takshil");
		System.out.println("New Thread Name :" +Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		

	}

}
