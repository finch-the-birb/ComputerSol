package org.example;

public class Desktop extends Computerlmpl{
    private String Model;
    private String Videocard;
    private String Status = "Off";
    private String InternetStatus = "Off";

    public Desktop (String cpu,String ozu,String hdd,String videocard) {
        setCPU(cpu);
        setHDD(ozu);
        setOZU(hdd);
        super.setModel("Desktop");
        this.Videocard = videocard;
    }

    public String getVideocard() {
        return Videocard;
    }

    public void setVideocard(String videocard) {
        this.Videocard = videocard;
    }

    @Override
    public void turnOn() throws IllegalArgumentException {
        switch (this.Status) {
            case "Off" -> {
                System.out.println(
                        "Computer " + super.getModel() + " [Spec: " + getCPU() + ", " + getHDD() + ", " + getOZU()
                                + ", " + getVideocard() + "] turning On..."
                );
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
                        "Computer " + super.getModel() + " [Spec: " + getCPU() + ", " + getHDD() + ", " + getOZU()
                                + ", " + getVideocard() + "] turning Off..."
                );
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
                        "Computer " + super.getModel() + " [Spec: " + getCPU() + ", " + getHDD() + ", " + getOZU()
                                + ", " + getVideocard() + "] connecting..."
                );
                this.InternetStatus = "On";
            }
            case "On" -> {
                System.out.println(
                        "Computer " + super.getModel() + " [Spec: " + getCPU() + ", " + getHDD() + ", " + getOZU()
                                + ", " + getVideocard() + "] disconnecting..."
                );
                this.InternetStatus = "Off";
            }
            default -> throw new IllegalArgumentException("Maybe this computer is broken...");
        }
    }
}
