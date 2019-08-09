package com.spulic.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ScheduledThreadPool {

    public static void main(String[] args){
        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println("core count: " + coreCount);
        ExecutorService service = Executors.newScheduledThreadPool();
        for(int i =0; i< 10 ; i++) {
            service.execute(new BasicTask());
        }
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}

class BasicTask implements Runnable {
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}
