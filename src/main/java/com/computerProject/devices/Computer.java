package com.computerProject.devices;

import com.computerProject.exceptions.InvalidUpgradeException;
import com.computerProject.exceptions.NetworkConnectionException;
import com.computerProject.exceptions.OverheatingException;
import com.computerProject.interfaces.Diagnosable;
import com.computerProject.interfaces.Networkable;
import com.computerProject.interfaces.Powerable;
import com.computerProject.interfaces.Upgradeable;

import java.util.*;

public class Computer extends Device implements Diagnosable, Networkable, Powerable, Upgradeable {

    public static int numberOfComputers = 0;
    protected CPU cpu;
    protected GPU gpu;
    private double temperature;

    private List<String> components;
    private Map<String,String> configuration;
    private Stack<String> operationHistory;

    static {
        System.out.println("This static block in Computer class is executed.");
    }

    public Computer(String brand, String model, CPU cpu, GPU gpu, Warranty warranty) {
        super(brand, model, warranty);
        this.cpu = cpu;
        this.gpu = gpu;
        this.temperature = 30;
        this.components = new ArrayList<>();
        this.configuration = new HashMap<>();
        this.operationHistory = new Stack<>();
    }

    public static void displayQuantityOfComputers() {
        System.out.println("It is " + numberOfComputers + " computers");
    }

    public void addComponent(String component) {
        components.add(component);
    }

    public void addConfiguration (String key, String value) {
        configuration.put(key,value);
    }

    public void addOperationToHistory(String operation) {
        operationHistory.push(operation);
    }

    @Override
    public void increaseTemperature(double increase) throws OverheatingException {
        this.temperature += increase;
        if (this.temperature > 90.0) {
            throw new OverheatingException("Computer is overheating! The current temperature is " + this.temperature + " Celsius degrees");
        }
    }

    @Override
    public void upgrade(String component) throws InvalidUpgradeException {
        if (component == null || component.isEmpty()) {
            throw new InvalidUpgradeException("Invalid component for upgrade.");
        }
        boolean upgradeSuccessful = false;

        if (!upgradeSuccessful) {
            throw new InvalidUpgradeException("Failed to upgrade component: " + component);
        }
        System.out.println("Upgrade successful.");
    }

    public void connectToNetwork(String networkName, String password) throws NetworkConnectionException {
        if (networkName == null || networkName.isEmpty()) {
            throw new NetworkConnectionException("Network name cannot be empty.");
        }
        boolean connectionSuccessful = false;

        if (!connectionSuccessful) {
            throw new NetworkConnectionException("Failed to connect to network: " + networkName);
        }
        System.out.println("Connected to network: " + networkName);
    }


    @Override
    public void displayInfo() {
        System.out.println("Computer: " + this);
        System.out.println("CPU: " + cpu);
        System.out.println("GPU: " + gpu);
    }

    @Override
    public String toString() {
        return super.toString() + ", CPU: " + cpu.getName() + ", GPU: " + gpu.getGPUName();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + cpu.hashCode() + gpu.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Computer computer = (Computer) obj;
        return cpu.equals(computer.cpu) && gpu.equals(computer.gpu);
    }

    public static int getNumberOfComputers() {
        return numberOfComputers;
    }

    public static void setNumberOfComputers(int numberOfComputers) {
        Computer.numberOfComputers = numberOfComputers;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }


    @Override
    public void repair() {
        System.out.println("Computer is repaired");
    }


    @Override
    public void powerOn() {
        System.out.println("Computer is On");
    }

    @Override
    public void powerOff() {
        System.out.println("Computer is powering Off");
    }

}
