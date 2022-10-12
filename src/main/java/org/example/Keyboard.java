package org.example;

public class Keyboard {
    private String connection;
    private String size;

    public String getSize() {
        return this.size;
    }

    public void setSize (String size) {
        this.size = size;
    }

    public String getConnectionKeyboard () {
        return connection;
    }

    public void setConnectionKeyboard (String connection) {
        this.connection = connection;
    }

    public Keyboard (String size) {
        setConnectionKeyboard("Display is connected to your device");
        setSize(size);
    }
}
