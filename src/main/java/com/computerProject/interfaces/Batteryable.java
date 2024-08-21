package main.java.com.computerProject.interfaces;

public interface Batteryable {
    void batteryIsCharging();
    default void checkIfBatteryIsCharged() {
        System.out.println("Battery is charged");
    }
}
