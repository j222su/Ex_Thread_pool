package com.js.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        // 1. newCachedThreadPool
        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=0; i<=10; i++) {
            MyRunnable myRunnable = new MyRunnable();
            executorService.submit(myRunnable);
//            executorService.execute(myRunnable);
        }

        //작업큐에 남아있는 작업이 모두 완료되었을 때 종료시킨다.
        executorService.shutdown();


    }
}
