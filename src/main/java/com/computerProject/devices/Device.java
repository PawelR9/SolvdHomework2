package main.java.com.computerProject.devices;

public abstract class Device {

    protected String brand;
    protected String model;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void displayInfo();

    @Override
    public String toString(){
        return "Brand: " + brand + ", model: " + model;
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + model.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Device device = (Device) obj;
    return brand.equals(device.brand) && model.equals(device.model);
    }

}
