package main.java.com.computerProject.interfaces;

public interface Networkable {

    void connectToNetwork(String networkName, String password);
    default void checkConnectionStatus() {
        System.out.println("Network is connected");
    }

}
