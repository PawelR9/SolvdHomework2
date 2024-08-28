package main.java.com.computerProject.devices;

import main.java.com.computerProject.exceptions.PowerFailureException;
import main.java.com.computerProject.interfaces.Powerable;

import java.util.*;

public class Server extends Desktop implements Powerable {

    private int numberOfCPUs;

    private Set<String> uniqueIPs;
    private Queue<String> taskQueue;


    public Server(String brand, String model, String size, CPU cpu, GPU gpu, Warranty warranty, int numberOfCPUs) {
        super(brand, model, size, cpu, gpu, warranty);
        this.numberOfCPUs = numberOfCPUs;
        numberOfComputers++;
        this.uniqueIPs = new HashSet<>();
        this.taskQueue = new LinkedList<>();
    }

    public void addIP (String ip) {
        uniqueIPs.add(ip);
    }

    public void showAllIPs() {
        System.out.println("Unique IPs: " + uniqueIPs);
    }

    public void addTask(String task) {
        taskQueue.add(task);
    }

    public void processTask() {
        while (!taskQueue.isEmpty()) {
            taskQueue.poll();
        }
    }

    @Override
    public void powerOn() {
        boolean powerAvailable = false;
        if (!powerAvailable) {
            throw new PowerFailureException("Power failure! Unable to power on the server.");
        }
        System.out.println("Server powered on.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Server: " + this);
        System.out.println("Number of CPUs: " + numberOfCPUs);
        System.out.println("CPU: " + cpu);
        System.out.println("GPU: " + gpu);
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of CPUs: " + numberOfCPUs;
    }

    public int getNumberOfCPUs() {
        return numberOfCPUs;
    }

    public void setNumberOfCPUs(int numberOfCPUs) {
        this.numberOfCPUs = numberOfCPUs;
    }
}