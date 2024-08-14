package main.java.com.computerProject.devices;

public class Computer extends Device {

    protected CPU cpu;
    protected GPU gpu;

    public Computer(String brand, String model, CPU cpu, GPU gpu) {
        super(brand, model);
        this.cpu = cpu;
        this.gpu = gpu;
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
}
