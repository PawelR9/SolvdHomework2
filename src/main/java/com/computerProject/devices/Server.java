package main.java.com.computerProject.devices;

public class Server extends Desktop {

    private int numberOfCPUs;

    public Server(String brand, String model, String size, CPU cpu, GPU gpu, int numberOfCPUs) {
        super(brand, model, size, cpu, gpu);
        this.numberOfCPUs = numberOfCPUs;
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
}