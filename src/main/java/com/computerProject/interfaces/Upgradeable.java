package com.computerProject.interfaces;

import com.computerProject.exceptions.InvalidUpgradeException;

public interface Upgradeable {
    void upgrade(String component) throws InvalidUpgradeException;

    default void checkAvailableUpdates() {
        System.out.println("Checking updates.");
    }
}
