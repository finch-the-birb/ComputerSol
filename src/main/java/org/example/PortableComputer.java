package org.example;

public class PortableComputer extends Computerlmpl {
    Keyboard keyboard = new Keyboard("75%"); //лень делать ввод...
    Display display = new Display("FullHD"); //лень делать ввод...

    public String connectKeyboard() {
        keyboard.setConnectionKeyboard("connected");
        return keyboard.getConnectionKeyboard();
    }

    public String disconnectKeyboard() {
        keyboard.setConnectionKeyboard("disconnected");
        return keyboard.getConnectionKeyboard();
    }

    public String connectDisplay() {
        display.setConnectionDisplay("connected");
        return display.getConnectionDisplay();
    }

    public String disconnectDisplay() {
        display.setConnectionDisplay("disconnected");
        return display.getConnectionDisplay();
    }

}
