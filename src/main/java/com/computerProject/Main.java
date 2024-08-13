package main.java.com.computerProject;

import main.java.com.computerProject.devices.*;

public class Main {

    CPU generalCPU = new CPU("Intel Core i3", 4);
    GPU generalGpu = new GPU("Intel Integrated Graphics", 0);

    CPU laptopCpu = new CPU("Intel Core i3 1215U", 6);
    GPU laptopGpu = new GPU("NIntel UHD Graphics", 8);


    CPU serverCpu = new CPU("Intel Xeon E-2336", 12);
    GPU serverGpu = new GPU("Matrox", 1);

    CPU desktopCpu = new CPU("Intel Core i7-14700F", 20);
    GPU desktopGpu = new GPU("NVIDIA GeForce RTX 4070 Super", 12);

    Computer generalComputer = new Computer("General Brand", "General model", generalCPU, generalGpu);
    Laptop laptop = new Laptop("Acer", "Aspire 3", 17.3, "IPS", laptopCpu, laptopGpu);
    Server server = new Server("Dell", "PowerEdge T350", "standard", serverCpu, serverGpu, "Built-in TPM module");
    Desktop desktop = new Desktop("G4M3R", "HERO", "Standard", desktopCpu, desktopGpu);

}



