package main.java.com.computerProject.interfaces;

public interface Powerable {

    void powerOn();

    void powerOff();

    default void checkPowerStatus() {
        System.out.println("Power is On");
    }

}
