package main.java.com.computerProject.devices;

public class Server extends Desktop {

    private String numberOfCPUs;

    public Server(String brand, String model, String size, CPU cpu, GPU gpu, String numberOfCPUs) {
        super(brand, model, size, cpu, gpu);
        this.numberOfCPUs = numberOfCPUs;
    }
}