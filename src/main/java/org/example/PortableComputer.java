package org.example;

public class PortableComputer extends Computerlmpl {
    Keyboard keyboard = new Keyboard("75%"); //���� ������ ����...
    Display display = new Display("FullHD"); //���� ������ ����...

    public String connectKeyboard() {
        return keyboard.getConnectionKeyboard();
    }

    public String connectDisplay() {
        return display.getConnectionDisplay();
    }

}
