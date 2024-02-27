package com.example;

public class Main {

    public static void main(String[] args){
        Thread thread = new Thread(new Multithreading());
        Thread thread2 = new Thread(new Multithreading());

        thread.start();
        thread2.start();
    }
}
