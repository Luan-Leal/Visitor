package org.example;

public class AmigoDeAmigo implements Usuario {

    private int ip;
    private String id;
    private Boolean precisaConvite;


    public AmigoDeAmigo(int ip, String id, Boolean precisaConvite) {
        this.ip = ip;
        this.id = id;
        this.precisaConvite = precisaConvite;
    }

    public int getIp() {
        return ip;
    }

    public String getId() {
        return id;
    }

    public Boolean getPrecisaConvite() {
        return precisaConvite;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirAmigoDeAmigo(this);
    }

}
