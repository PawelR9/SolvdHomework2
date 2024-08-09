package main.java.com.computerProject;

import main.java.com.computerProject.devices.*;

public class Main {

    Computer generalComputer = new Computer("General Brand", "General model");
    Laptop laptop = new Laptop("Acer", "Aspire 3", 17.3, "IPS");
    GamingLaptop gamingLaptop = new GamingLaptop("Acer", "Nitro V", 15.6 , "LED", "AMD Ryzen™ 5 7535HS", "NVIDIA GeForce RTX 3050");
    Server server = new Server("Dell", "PowerEdge T350", "standard" , "Built-in TPM module");
    Desktop desktop = new Desktop("G4M3R", "HERO", "Standard");

}



