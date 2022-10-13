package org.example;

public class Main {
    public static void main(String[] args) {

        Computer[] Computer = new Computer[6];

        Laptop laptop = new Laptop("intel i7", "16gb ssd", "250gb", "Fujitsu");
        Server server = new Server("intel i5", "8gb ssd", "300gb");
        Desktop desktop = new Desktop("intel i7", "16gb ssd", "700gb","RTX3050");
        Netbook netbook = new Netbook("intel i7", "8gb ssd", "250gb", "Acer");
        Monoblock monoblock = new Monoblock("intel i5", "8gb ssd", "120gb", "Apple", "4K");
        Nettop nettop = new Nettop("intel i7", "4gb ssd", "330gb", "HP");

        Computer[0] = laptop;
        Computer[1] = netbook;
        Computer[2] = nettop;
        Computer[3] = monoblock;
        Computer[4] = server;
        Computer[5] = desktop;

        for (int i = 0; i < 6; i++) {
            Computer[i].turnOn();
            Computer[i].internetConnect();
            Computer[i].turnOff();
        }


    }
}