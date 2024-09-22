package com.computerProject;

import com.computerProject.threads.CallableTask;
import com.computerProject.threads.RunnableTask;
import com.computerProject.threads.ThreadTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Threads {
    public static void main(String[] args) {

        RunnableTask runnableTask = new RunnableTask();
        Thread runnableThread = new Thread(runnableTask);

        ThreadTask threadTask = new ThreadTask();

        runnableThread.start();
        threadTask.start();

        //Callable
        ExecutorService executor = Executors.newSingleThreadExecutor();
        CallableTask callableTask = new CallableTask();
        Future<String> result = executor.submit(callableTask);

        try {
            System.out.println("Callable result: " + result.get());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}