package main.java.com.computerProject.devices;

public class CPU {

    protected String name;
    protected int cores;

    public CPU(String name, int cores) {
        this.name = name;
        this.cores = cores;
    }

    public String getName() {
        return name;
    }

    public void setName(String model) {
        this.name = name;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    @Override
    public String toString() {
        return name + " with " + cores + " cores";
    }

    @Override
    public int hashCode() {
        return name.hashCode() + cores;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CPU cpu = (CPU) obj;
        return cores == cpu.cores && name.equals(cpu.name);
    }
}
