package com.training;

public class Test {
    public static void main(String[] args) {
        try {
            HelloThread hlo = new HelloThread();
            hlo.run();
            Hello hello = new Hello();
            Thread thread = new Thread(hello, "Jey");
            thread.start();
            System.out.println(thread.getName());
            thread.start();
        }
        catch (IllegalThreadStateException e){
            System.out.println(e.getMessage());
            System.out.println("Illegal ");
        }


    }
}