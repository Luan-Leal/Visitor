package org.example;

public class UsuarioVisitor implements Visitor {

    public String exibir(Usuario usuario) {
        return usuario.aceitar(this);
    }

    @Override
    public String exibirHost(Host host) {
        return "Host{" +
                "ip=" + host.getIp() +
                ", id='" + host.getId() + '\'' +
                ", Nome da sala=" + host.getSala() +
                '}';
    }

    @Override
    public String exibirAmigo(Amigo amigo) {
        return "Amigo{" +
                "ip=" + amigo.getIp() +
                ", id='" + amigo.getId() + '\'' +
                ", entra somente com convite='" + amigo.getPrecisaConvite() + '\'' +
                '}';
    }

    @Override
    public String exibirAmigoDeAmigo(AmigoDeAmigo amigoDeAmigo) {
        return "AmigoDeAmigo{" +
                "ip=" + amigoDeAmigo.getIp() +
                ", id='" + amigoDeAmigo.getId() + '\'' +
                ", entra somente com convite='" + amigoDeAmigo.getPrecisaConvite() + '\'' +
                '}';
    }
}
