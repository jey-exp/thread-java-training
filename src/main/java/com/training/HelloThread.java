package com.training;

public class HelloThread extends Thread{
    @Override
    public void run(){
        System.out.println("This is running");
    }
}
