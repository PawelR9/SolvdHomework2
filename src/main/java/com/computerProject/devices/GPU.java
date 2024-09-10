package com.computerProject.devices;

public class GPU {
    protected String GPUName;
    protected int memory;

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

    @Override
    public String toString() {
        return GPUName + " with " + memory + "GB of memory";
    }

    @Override
    public int hashCode() {
        return GPUName.hashCode() + memory;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        GPU gpu = (GPU) obj;
        return GPUName.equals(gpu.GPUName) && memory == gpu.memory;
    }
}

