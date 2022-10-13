package org.example;

public class Monoblock extends Computerlmpl {
    private String Model;
    private String DisplayRes;
    private String Status = getStatus();
    private String InternetStatus = getInternetStatus();

    public Monoblock (String cpu,String ozu,String hdd, String model, String resolution) {
        setCPU(cpu);
        setHDD(ozu);
        setOZU(hdd);
        super.setModel(model);
        this.DisplayRes = resolution;
    }
    Display display = new Display(DisplayRes);

    @Override
    public void turnOn() throws IllegalArgumentException {
        switch (this.Status) {
            case "Off" -> {
                System.out.println(
                        "Computer " + super.getModel() + " [Spec: " + getCPU() + ", " + getHDD() + ", " + getOZU() +
                                "] turning On..."
                );
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
                display.setConnectionDisplay("disconnected");
                System.out.println("Display " + display.getConnectionDisplay());
                this.Status = "Off";
            }
            case "Off" -> System.out.println("Already turned Off");
            default -> throw new IllegalArgumentException("Maybe this computer is broken...");
        }
    }

    @Override
    public void internetConnect() throws IllegalArgumentException {
        switch (this.InternetStatus) {
            case "Off" -> {
                System.out.println(
                        "Computer " + super.getModel() + " [Spec: " + getCPU() + ", " + getHDD() + ", " + getOZU() +
                                "] connecting..."
                );
                this.InternetStatus = "On";
            }
            case "On" -> {
                System.out.println(
                        "Computer " + super.getModel() + " [Spec: " + getCPU() + ", " + getHDD() + ", " + getOZU() +
                                "] disconnecting..."
                );
                this.InternetStatus = "Off";
            }
            default -> throw new IllegalArgumentException("Maybe this computer is broken...");
        }
    }
}
