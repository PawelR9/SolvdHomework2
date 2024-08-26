package main.java.com.computerProject.interfaces;

import main.java.com.computerProject.exceptions.NetworkConnectionException;

public interface Networkable {

    void connectToNetwork(String networkName, String password) throws NetworkConnectionException;

    default void checkConnectionStatus() {
        System.out.println("Network is connected");
    }

}
