package main.java.com.computerProject.devices;

public class GamingLaptop extends Laptop {

    private String cpuType;
    private String gpuType;

    public GamingLaptop(String brand, String model, double screenSize, String screenType, String cpuType, String gpuType) {
        super(brand, model, screenSize, screenType);
        this.cpuType = cpuType;
        this.gpuType = gpuType;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public String getGpuType() {
        return gpuType;
    }

    public void setGpuType(String gpuType) {
        this.gpuType = gpuType;
    }
}
