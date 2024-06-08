package edu.gustavo.desafiosdeprojeto.desafioiphone.iphone;

public class Iphone implements Telefone, Safari, Imusic {
    public void ligar() {
        System.out.println("Ligando");
    }
    public void atender() {
        System.out.println("Atendeu");
    }
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciou o correio de voz");
    }
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página");
    }
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionou a página");
    }
    public void tocar() {
        System.out.println("Musica Tocando");
    }
    public void pausar() {
        System.out.println("Musica pausada");
    }
    public void selecionarMusica() {
        System.out.println("Musica Selecionada");
    }


}
