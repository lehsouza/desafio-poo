package equipamentos.apple;

import equipamentos.celular.AparelhoTelefonico;
import equipamentos.computador.NavegadorInternet;
import equipamentos.radio.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    // Métodos do NavegadorInternet
    public void exibirPagina(String url) {
        System.out.println(url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página web.");
    }

    // Métodos do AparelhoTelefonico
    public void ligar(String numero) {
        System.out.println(numero);
    }

    public void atender() {
        System.out.println("Atendendendo.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio e voz.");
    }

    // Métodos do ReprodutorMusical
    public void tocar() {
        System.out.println("Tocando música.");
    }

    public void pausar() {
        System.out.println("Pausando música.");
    }

    public void selecionarMusica(String musica) {
        System.out.println(musica);
    }
    
}