package com.computerProject.threads;

public class RunnableTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("Runnable iteration " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

