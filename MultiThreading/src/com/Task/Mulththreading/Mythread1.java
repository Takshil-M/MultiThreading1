package com.Task.Mulththreading;

class BookTheaterSeat1 {
    int totalSeat = 10;

     void bookSeat(int seat) {
        if (totalSeat >= seat) {
            System.out.println(Thread.currentThread().getName() + " booked seat successfully.");
            totalSeat = totalSeat - seat;
            System.out.println("Seats left: " + totalSeat);
        } else {
            System.out.println(Thread.currentThread().getName() + " can't book seats.");
            System.out.println("Seats left: " + totalSeat);
        }
    }
}

public class Mythread1 extends Thread {
     BookTheaterSeat1 b;
    int seat;
     Mythread1(BookTheaterSeat1 b,int seat) 
	
    {
    	this.b=b;
    	this.seat=seat;
    }
    public void run() {
        b.bookSeat(seat);
    }
}
 class Mythreads2 extends Thread {
    BookTheaterSeat1 b;
    int seat;
    Mythreads2(BookTheaterSeat1 b,int seat) 
	
   {
   	this.b=b;
   	this.seat=seat;
   }
   public void run() {
       b.bookSeat(seat);
   }
     public static void main(String[] args) {
       
    	BookTheaterSeat1  b = new BookTheaterSeat1();

        Mythread1 t1 = new Mythread1(b, 7);
        t1.start();
        Mythread1 t2=new Mythread1(b, 6);
        t2.start();
        
        BookTheaterSeat1  b2 = new BookTheaterSeat1();

        Mythreads2 t3 = new Mythreads2(b2,8);
        t3.start();
        Mythread1 t4=new Mythread1(b2, 6);
        t4.start();
    }
}
