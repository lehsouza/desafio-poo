package estabelecimento;

import equipamentos.apple.Iphone;

public class Loja {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.exibirPagina("Exibindo página.");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

        iphone.ligar("Ligando.");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Selecionando música.");
    }
}
