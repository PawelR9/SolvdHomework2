package main.java.com.computerProject.exceptions;

public class BatteryLowException extends RuntimeException {
    public BatteryLowException(String message) {
        super(message);
    }
}
