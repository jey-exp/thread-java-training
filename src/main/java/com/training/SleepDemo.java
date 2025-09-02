package com.training;

import java.util.ArrayList;
import java.util.Arrays;

public class SleepDemo {
    public static void main(String[] args) {
        ArrayList<String> seasons = new ArrayList<>(Arrays.asList("SUma", "Einta", "Springa", "Autuma"));
        for(String season : seasons){
            try{
                Thread.sleep(3000);
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println(season);
        }
    }
}
