package org.example;

public class Server extends Computerlmpl {
    private String Model;
    public Server(String cpu,String ozu,String hdd) {
        setCPU(cpu);
        setHDD(ozu);
        setOZU(hdd);
        super.setModel("R2D2"); //��, � �� ���� � ������ ��������, ������ ��� �������� ;)
    }
}
