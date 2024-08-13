package main.java.com.computerProject.devices;

public class GPU {
    private String GPUName;
    private int memory;

    public GPU(String GPUName, int memory) {
        this.GPUName = GPUName;
        this.memory = memory;
    }

    public String getGPUName() {
        return GPUName;
    }

    public void setGPUName(String GPUName) {
        this.GPUName = GPUName;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}