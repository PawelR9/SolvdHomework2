package main.java.com.computerProject.devices;

import main.java.com.computerProject.interfaces.Diagnosable;
import main.java.com.computerProject.interfaces.Networkable;
import main.java.com.computerProject.interfaces.Powerable;
import main.java.com.computerProject.interfaces.Upgradeable;

public class Computer extends Device implements Diagnosable, Networkable, Powerable, Upgradeable {

    public static int numberOfComputers = 0;
    protected CPU cpu;
    protected GPU gpu;

    static {
        System.out.println("This static block in Computer class is executed.");
    }

    public Computer(String brand, String model, CPU cpu, GPU gpu, Warranty warranty) {
        super(brand, model, warranty);
        this.cpu = cpu;
        this.gpu = gpu;

    }

    public static void displayQuantityOfComputers() {
        System.out.println("It is " + numberOfComputers + " computers");
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
    public void connectToNetwork(String networkName, String password) {
        System.out.println("Connected to network " + networkName + " successfully.");
    }

    @Override
    public void powerOn() {
        System.out.println("Computer is On");
    }

    @Override
    public void powerOff() {
        System.out.println("Computer is powering Off");
    }

    @Override
    public void upgrade() {
        System.out.println("Computer components are updating.");
    }
}
