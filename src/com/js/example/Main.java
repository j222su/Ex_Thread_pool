package com.js.example;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    static int count = 1;

    public static void main(String[] args) {
        // 1. newCachedThreadPool
        ExecutorService executorService = Executors.newCachedThreadPool();

        MyRunnable myRunnable[] = new MyRunnable[2];

        for(int i=0; i<2; i++) {
            myRunnable[i] = new MyRunnable(i+1);
            executorService.submit(myRunnable[i]);
        }

        //작업큐에 남아있는 작업이 모두 완료되었을 때 종료시킨다.
        //executorService.shutdown();
    }
}
