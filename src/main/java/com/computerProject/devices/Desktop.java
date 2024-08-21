package main.java.com.computerProject.devices;

public class Desktop extends Computer {
    private String size;

    public Desktop(String model, String brand, String size, CPU cpu, GPU gpu, Warranty warranty) {
        super(model, brand, cpu, gpu, warranty);
        this.size = size;
        numberOfComputers++;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void displayInfo() {
        System.out.println("Desktop: " + this);
        System.out.println("Size: " + size);
        System.out.println("CPU: " + cpu);
        System.out.println("GPU: " + gpu);
    }

    @Override
    public String toString() {
        return super.toString() + ", Size: " + size;
    }
}

