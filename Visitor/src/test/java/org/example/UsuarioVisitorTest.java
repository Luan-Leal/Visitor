package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioVisitorTest {

    @Test
    void deveExibirHostDaSessao() {
        Host host = new Host(111, "Luan", new Sala("Sala de Gartic"));

        UsuarioVisitor visitor = new UsuarioVisitor();
        assertEquals("Host{ip=111, id='Luan', Nome da sala=Sala de Gartic}", visitor.exibir(host));
    }

    @Test
    void deveExibirOsConvidadosAmigoDoHost() {
        Amigo amigo = new Amigo(222, "Silvão", false);

        UsuarioVisitor visitor = new UsuarioVisitor();
        assertEquals("Amigo{ip=222, id='Silvão', entra somente com convite='false'}", visitor.exibir(amigo));
    }

    @Test
    void deveExibirOsConvidadosAmigoDeAmigosDoHost() {
        AmigoDeAmigo amigoDeAmigo = new AmigoDeAmigo(333, "José", true);

        UsuarioVisitor visitor = new UsuarioVisitor();
        assertEquals("AmigoDeAmigo{ip=333, id='José', entra somente com convite='true'}", visitor.exibir(amigoDeAmigo));
    }

}