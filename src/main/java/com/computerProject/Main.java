package main.java.com.computerProject;

import main.java.com.computerProject.devices.*;

public class Main {

    public static void main(String[] args) {

        CPU generalCPU = new CPU("Intel Core i3", 4);
        GPU generalGpu = new GPU("Intel Integrated Graphics", 0);

        CPU laptopCpu = new CPU("Intel Core i3 1215U", 6);
        GPU laptopGpu = new GPU("Intel UHD Graphics", 8);


        CPU serverCpu = new CPU("Intel Xeon E-2336", 12);
        GPU serverGpu = new GPU("Matrox", 1);

        CPU desktopCpu = new CPU("Intel Core i7-14700F", 20);
        GPU desktopGpu = new GPU("NVIDIA GeForce RTX 4070 Super", 12);

        Device generalComputer = new Computer("General Brand", "General model", generalCPU, generalGpu);
        Device laptop = new Laptop("Acer", "Aspire 3", 17.3, "IPS", laptopCpu, laptopGpu);
        Device server = new Server("Dell", "PowerEdge T350", "standard", serverCpu, serverGpu, 1);
        Device desktop = new Desktop("G4M3R", "HERO", "Standard", desktopCpu, desktopGpu);

        System.out.println();
        generalComputer.displayInfo();
        System.out.println();
        laptop.displayInfo();
        System.out.println();
        server.displayInfo();
        System.out.println();
        desktop.displayInfo();
    }




}

