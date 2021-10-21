package com.js.example;

import java.util.Timer;
import java.util.TimerTask;

public class MyRunnable implements Runnable {

    int index = 0;
    int count = 1;

    public MyRunnable(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        System.out.println(index+"번 스레드 생성");

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println(index+"카운트 : "+count);
                count++;
            }
        };
        timer.schedule(timerTask, 1000, 1000);


    }
}
