package com.training;

import java.util.ConcurrentModificationException;

public class ThreadJoinDemo {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(new MyRunnable(), "First");
        Thread thread2 = new Thread(new MyRunnable(), "Second");
        Thread thread3 = new Thread(new MyRunnable(), "Third");
        Thread thread4 = new Thread(new MyRunnable(), "Fourth");
        thread1.start();
        try{
           thread1.join(1000);
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        thread2.start();
        try{
            thread1.join();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        thread3.start();
        try{
            thread1.join();
            thread2.join();
            thread3.join();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
