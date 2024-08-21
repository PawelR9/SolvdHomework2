package main.java.com.computerProject.devices;

public abstract class Device {

    protected String brand;
    protected String model;
    private Warranty warranty;

    public Device(String brand, String model, Warranty warranty) {
        this.brand = brand;
        this.model = model;
        this.warranty = warranty;
    }

    public abstract void displayInfo();

    @Override
    public String toString() {
        return "Brand: " + brand + ", model: " + model + " " + warranty;
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

    public Warranty getWarranty() {
        return warranty;
    }

    public void setWarranty(Warranty warranty) {
        this.warranty = warranty;
    }

}
