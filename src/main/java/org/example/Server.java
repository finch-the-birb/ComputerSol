package org.example;

public class Server extends Computerlmpl {
    public Server(String cpu,String ozu,String hdd) {
        setCPU(cpu);
        setHDD(ozu);
        setOZU(hdd);
        super.setModel("R2D2"); //��, � �� ���� � ������ ��������, ������ ��� �������� ;)
    }
}
