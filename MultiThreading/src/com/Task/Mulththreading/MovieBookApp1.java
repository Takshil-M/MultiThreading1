package com.Task.Mulththreading;

class BookTheaterSeat {
    int totalSeat = 10;

    synchronized void bookSeat(int seat) {
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

public class MovieBookApp1 extends Thread {
    static BookTheaterSeat b;
    int seat;

    public void run() {
        b.bookSeat(seat);
    }

    public static void main(String[] args) {
        b = new BookTheaterSeat();

        MovieBookApp1 takshil = new MovieBookApp1();
        takshil.seat = 7;
        takshil.setName("Takshil");
        takshil.start();

        MovieBookApp1 saurabh = new MovieBookApp1();
        saurabh.seat = 6;
        saurabh.setName("Saurabh");
        saurabh.start();
    }
}
