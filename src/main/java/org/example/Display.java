package org.example;

public class Display {
    private String connection;
    private String resolution;

    public String getResolution () {
        return this.resolution;
    }

    public void setResolution (String resolution) {
        this.resolution = resolution;
    }

    public String getConnectionDisplay () {
        return connection;
    }

    public void setConnectionDisplay (String connection) {
        this.connection = connection;
    }

    public Display (String resolution) {
        setConnectionDisplay("Display is connected to your device");
        setResolution(resolution);
    }
}

