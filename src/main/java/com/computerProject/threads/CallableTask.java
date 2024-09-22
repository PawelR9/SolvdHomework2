package com.computerProject.threads;

import java.util.concurrent.Callable;

public class CallableTask implements Callable {
    @Override
    public Object call() throws Exception {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("Collable iteration " + i);
            Thread.sleep(10);
        } return "Callable Task";
    }
}

