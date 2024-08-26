package main.java.com.computerProject;

import main.java.com.computerProject.devices.*;
import main.java.com.computerProject.exceptions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            handleDevices();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        tryWithResourcesExample();
    }

    private static void handleDevices() {
        CPU generalCPU = new CPU("Intel Core i3", 4);
        GPU generalGpu = new GPU("Intel Integrated Graphics", 0);

        CPU laptopCpu = new CPU("Intel Core i3 1215U", 6);
        GPU laptopGpu = new GPU("Intel UHD Graphics", 8);


        CPU serverCpu = new CPU("Intel Xeon E-2336", 12);
        GPU serverGpu = new GPU("Matrox", 1);

        CPU desktopCpu = new CPU("Intel Core i7-14700F", 20);
        GPU desktopGpu = new GPU("NVIDIA GeForce RTX 4070 Super", 12);

        Warranty deviceWarranty = new Warranty();

        Computer generalComputer = new Computer("General Brand", "General model", generalCPU, generalGpu, deviceWarranty);

        Laptop laptop = new Laptop("Acer", "Aspire 3", 17.3, "IPS", laptopCpu, laptopGpu, deviceWarranty);
        laptop.checkIfBatteryIsCharged();
        laptop.checkPowerStatus();
        laptop.checkAvailableUpdates();

        Server server = new Server("Dell", "PowerEdge T350", "standard", serverCpu, serverGpu, deviceWarranty, 1);
        Device desktop = new Desktop("G4M3R", "HERO", "Standard", desktopCpu, desktopGpu, deviceWarranty);

        try {
            laptop.upgrade("RAM");
        } catch (InvalidUpgradeException e) {
            System.out.println("Upgrade failed: " + e.getMessage());
        }

        try {
            laptop.connectToNetwork("HomeWiFi", "password123");
        } catch (NetworkConnectionException e) {
            System.out.println("Network connection error: " + e.getMessage());
        }

        try {
            laptop.useBattery(95);
        } catch (BatteryLowException e) {
            System.out.println("Battery warning: " + e.getMessage());
        }

        try {
            generalComputer.increaseTemperature(65.0);
        } catch (OverheatingException e) {
            System.out.println("Overheating warning: " + e.getMessage());
        }

        try {
            server.powerOn();
        } catch (PowerFailureException e) {
            System.out.println("Power failure: " + e.getMessage());
        }

        System.out.println();
        generalComputer.displayInfo();
        System.out.println();
        laptop.displayInfo();
        System.out.println();
        server.displayInfo();
        System.out.println();
        desktop.displayInfo();

        System.out.println();
        Computer.displayQuantityOfComputers();

    }

    private static void tryWithResourcesExample() {
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

