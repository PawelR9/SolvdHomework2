package main.java.com.computerProject.devices;

import main.java.com.computerProject.exceptions.PowerFailureException;
import main.java.com.computerProject.interfaces.Powerable;

public class Server extends Desktop implements Powerable {

    private int numberOfCPUs;


    public Server(String brand, String model, String size, CPU cpu, GPU gpu, Warranty warranty, int numberOfCPUs) {
        super(brand, model, size, cpu, gpu, warranty);
        this.numberOfCPUs = numberOfCPUs;
        numberOfComputers++;
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