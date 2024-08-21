package main.java.com.computerProject.interfaces;

public interface Upgradeable {
    void upgrade();
    default void checkAvailableUpdates() {
        System.out.println("Checking updates.");
    }
}
