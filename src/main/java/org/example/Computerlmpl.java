package org.example;

public class Computerlmpl implements Computer {
    private String CPU;
    private String OZU;
    private String HDD;
    private String Model;
    private String Status = "Off";
    private String InternetStatus = "Off";

    public String getStatus() {
        return Status;
    }

    public String getInternetStatus() {
        return InternetStatus;
    }

    public String getOZU() {
        return OZU;
    }

    public void setOZU(String OZU) {
        this.OZU = OZU;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String name) {
        this.Model = Model;
    }

    public void turnOn() throws IllegalArgumentException {
        switch (this.Status) {
            case "Off" -> {
                System.out.println(
                        "Computer" + getModel() + "[Spec:" + getCPU() + "," + getHDD() + "," + getOZU() + "] turning On..."
                    );
                this.Status = "On";
            }
            case "On" -> System.out.println("Already turned On");
            default -> throw new IllegalArgumentException("Maybe this computer is broken...");
        }
    }

    public void turnOff() throws IllegalArgumentException {
        switch (this.Status) {
            case "On" -> {
                System.out.println(
                        "Computer" + getModel() + "[Spec:" + getCPU() + "," + getHDD() + "," + getOZU() + "] turning Off..."
                );
                this.Status = "Off";
            }
            case "Off" -> System.out.println("Already turned Off");
            default -> throw new IllegalArgumentException("Maybe this computer is broken...");
        }
    }
    
    public void internetConnect() throws IllegalArgumentException {
        switch (this.InternetStatus) {
            case "Off" -> {
                System.out.println(
                        "Computer" + getModel() + "[Spec:" + getCPU() + "," + getHDD() + "," + getOZU() + "] connecting..."
                );
                this.InternetStatus = "On";
            }
            case "On" -> {
                System.out.println(
                        "Computer" + getModel() + "[Spec:" + getCPU() + "," + getHDD() + "," + getOZU() + "] disconnecting..."
                );
                this.InternetStatus = "Off";
            }
            default -> throw new IllegalArgumentException("Maybe this computer is broken...");
        }
    }
}
