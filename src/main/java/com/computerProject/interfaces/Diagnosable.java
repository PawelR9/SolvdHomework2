package com.computerProject.interfaces;

import com.computerProject.exceptions.OverheatingException;

public interface Diagnosable {
    void repair();

    default void diagnose() {
        System.out.println("Diagnose is running.");
    }

    void increaseTemperature(double increase) throws OverheatingException;
}
