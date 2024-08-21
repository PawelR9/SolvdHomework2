package main.java.com.computerProject.interfaces;

public interface Diagnosable {
    void repair();
    default void diagnose() {
        System.out.println("Diagnose is running.");
    }
}
