package main.java.com.computerProject.devices;

public class Laptop extends Computer {

    private double screenSize;
    private String screenType;

    public Laptop(String brand, String model, double screenSize, String screenType, CPU cpu, GPU gpu) {
        super(brand, model, cpu, gpu);
        this.screenSize = screenSize;
        this.screenType = screenType;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Laptop: " + this);
        System.out.println("Screen size: " + screenSize + "\"");
        System.out.println("Screen type: " + screenType);
        System.out.println("CPU: " + cpu);
        System.out.println("GPU: " + gpu);
    }

    @Override
    public String toString() {
        return super.toString() + ", Screen: " + screenSize + "\" " + screenType;
    }
}
