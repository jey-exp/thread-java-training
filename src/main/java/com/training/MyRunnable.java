package com.training;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("My Runnable class - thread name :" + Thread.currentThread().getName());
        System.out.println("My Runnable class - state : " + Thread.currentThread().getState());
    }
}