package com.computerProject.interfaces;

import com.computerProject.exceptions.NetworkConnectionException;

public interface Networkable {

    void connectToNetwork(String networkName, String password) throws NetworkConnectionException;

    default void checkConnectionStatus() {
        System.out.println("Network is connected");
    }

}
