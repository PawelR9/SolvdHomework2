package main.java.com.computerProject.devices;

public class Laptop extends Computer{

    private double screenSize;
    private String screenType;

    public Laptop(String brand, String model, double screenSize, String screenType) {
        super(brand, model);
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
}
