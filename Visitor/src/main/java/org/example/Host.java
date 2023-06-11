package org.example;

public class Host implements Usuario {

    private int ip;
    private String id;
    private Sala sala;

    public Host(int ip, String id, Sala sala) {
        this.ip = ip;
        this.id = id;
        this.sala = sala;
    }

    public int getIp() {
        return ip;
    }

    public String getId() {
        return id;
    }

    public String getSala() {
        return this.sala.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirHost(this);
    }

}
