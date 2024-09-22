package com.computerProject.threads;

public class ThreadTask extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("Thread iteration " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


