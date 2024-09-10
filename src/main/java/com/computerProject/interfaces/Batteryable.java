package com.computerProject.interfaces;

import com.computerProject.exceptions.BatteryLowException;

public interface Batteryable {
    void batteryIsCharging();

    default void checkIfBatteryIsCharged() {
        System.out.println("Battery is charged");
    }

    void useBattery(int usage) throws BatteryLowException;
}
