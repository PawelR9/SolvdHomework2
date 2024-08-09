package main.java.com.computerProject.devices;

public class Server extends Desktop{

    private String additionalInfo;

    public Server(String model, String brand, String size, String additionalInfo) {
        super(model, brand, size);
        this.additionalInfo = additionalInfo;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setNumberOfCoresCPU(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
