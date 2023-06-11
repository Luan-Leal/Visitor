package org.example;

public interface Visitor {

    String exibirHost(Host host);
    String exibirAmigo(Amigo amigo);
    String exibirAmigoDeAmigo(AmigoDeAmigo amigoDeAmigo);

}
