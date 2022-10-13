package org.example;

public class Nettop extends Computerlmpl{
    private String Model;
    public Nettop (String cpu,String ozu,String hdd, String model) {
        setCPU(cpu);
        setHDD(ozu);
        setOZU(hdd);
        super.setModel(model);
    }
}
