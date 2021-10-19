package com.js.example;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        int value = Integer.parseInt("예외");
    }
}
