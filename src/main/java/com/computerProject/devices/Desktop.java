package main.java.com.computerProject.devices;

public class Desktop extends Computer {

    private String size;

    public Desktop(String model, String brand, String size) {
        super(model, brand);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
