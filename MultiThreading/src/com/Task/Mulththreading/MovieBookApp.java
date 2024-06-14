package com.Task.Mulththreading;

  class BookTheaterSeats
  {
	int Total_seat=10;
	 void bookSeat( int seat) 
	 {
		 System.out.println("Hi:"+Thread.currentThread().getName());
		 System.out.println("Hi:"+Thread.currentThread().getName());
		 System.out.println("Hi:"+Thread.currentThread().getName());
		 System.out.println("Hi:"+Thread.currentThread().getName());
		 System.out.println("Hi:"+Thread.currentThread().getName());
		 synchronized (this) {
			
		
		if(Total_seat>=seat) {
			System.out.println("seat booked successfully");
			Total_seat=Total_seat-seat;
			System.out.println("seat left:" + Total_seat);
		}
		else {
			System.out.println("seat can't be booked...!");
			Total_seat=Total_seat-seat;
			System.out.println("seat left:" + Total_seat);
		}
	 }
		System.out.println("Hello:"+Thread.currentThread().getName());
		System.out.println("Hello:"+Thread.currentThread().getName());
		System.out.println("Hello:"+Thread.currentThread().getName());
		System.out.println("Hello:"+Thread.currentThread().getName());
		System.out.println("Hello:"+Thread.currentThread().getName());
	}
	 
}

public class MovieBookApp extends Thread{
	 static BookTheaterSeats b;
	 int seat;
	 public void run() {
		b.bookSeat(seat);
	}
 

public static void main(String[] args) {
			
		b=new BookTheaterSeats();		
		MovieBookApp takshil=new MovieBookApp();
		takshil.seat=7;
		takshil.start();
		
		MovieBookApp saurabh=new MovieBookApp();
		saurabh.seat=6;
		saurabh.start();
		
	}

 }

