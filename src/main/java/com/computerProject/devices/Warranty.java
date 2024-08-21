package main.java.com.computerProject.devices;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

public final class Warranty {
    public static final int warrantyDurationMonths = 24;

    private String warrantyID;
    private LocalDate startDate;
    private static final Random random = new Random();

    public Warranty() {
        this.warrantyID = generateRandomID();
        this.startDate = LocalDate.now(); // Set warranty start date to the current date
    }

    private final String generateRandomID() {
        return UUID.randomUUID().toString(); // Generates a random UUID as warranty ID
    }

    public String getWarrantyID() {
        return warrantyID;
    }

    public void setWarrantyID(String warrantyID) {
        this.warrantyID = warrantyID;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void displayWarrantyInfo() {
        System.out.println("Warranty ID: " + warrantyID);
        System.out.println("Warranty Duration: " + warrantyDurationMonths + " months");
        System.out.println("Warranty Start Date: " + startDate);
    }

    @Override
    public String toString() {

        return "Warranty: " +
                "warrantyID= " + warrantyID +
                ", startDate= " + startDate +
                ".";
    }
}
