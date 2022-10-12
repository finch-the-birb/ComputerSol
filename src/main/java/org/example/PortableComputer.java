package org.example;

public class PortableComputer {
    Keyboard keyboard = new Keyboard("75%"); //лень делать ввод...
    Display display = new Display("FullHD"); //лень делать ввод...

    public String connectKeyboard() {
        return keyboard.getConnectionKeyboard();
    }

    public String connectDisplay() {
        return display.getConnectionDisplay();
    }

}
