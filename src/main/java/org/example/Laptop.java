package org.example;

public class Laptop extends PortableComputer {
    private String CPU;
    private String OZU;
    private String HDD;
    private String Model;
    private String Status = "Off";

    public Laptop (String cpu,String ozu,String hdd, String model) {
        setCPU(cpu);
        setHDD(ozu);
        setOZU(hdd);
        super.setModel(model);
    }

    @Override
    public void turnOn() throws IllegalArgumentException {
        switch (this.Status) {
            case "Off" -> {
                System.out.println(
                        "Computer " + super.getModel() + " [Spec: " + getCPU() + ", " + getHDD() + ", " + getOZU() +
                                "] turning On..."
                );
                keyboard.setConnectionKeyboard("connected");
                System.out.println("Keyboard " + keyboard.getConnectionKeyboard());
                display.setConnectionDisplay("connected");
                System.out.println("Display " + display.getConnectionDisplay());
                this.Status = "On";
            }
            case "On" -> System.out.println("Already turned On");
            default -> throw new IllegalArgumentException("Maybe this computer is broken...");
        }
    }


    @Override
    public void turnOff() throws IllegalArgumentException {
        switch (this.Status) {
            case "On" -> {
                System.out.println(
                        "Computer " + super.getModel() + " [Spec: " + getCPU() + ", " + getHDD() + ", " + getOZU() +
                                "] turning Off..."
                );
                keyboard.setConnectionKeyboard("disconnected");
                System.out.println("Keyboard " + keyboard.getConnectionKeyboard());
                display.setConnectionDisplay("disconnected");
                System.out.println("Display " + display.getConnectionDisplay());
                this.Status = "Off";
            }
            case "Off" -> System.out.println("Already turned Off");
            default -> throw new IllegalArgumentException("Maybe this computer is broken...");
        }
    }
}
