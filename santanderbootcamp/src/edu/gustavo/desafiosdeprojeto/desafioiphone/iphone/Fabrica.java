package edu.gustavo.desafiosdeprojeto.desafioiphone.iphone;

public class Fabrica {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("APP TELEFONE INICIADO");{
            iphone.ligar();
            iphone.atender();
            iphone.iniciarCorrerioVoz();
        }
        System.out.println("------------------------");

        System.out.println("SAFARI (NAVEGADOR WEB) INICIADO");{

        
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina(null);
        }
        System.out.println("---------------------------");

        System.out.println("iMusic Iniciado");{
            iphone.selecionarMusica();
            iphone.tocar();
            iphone.pausar();
        }
        System.out.println("-------------------------------");

    }
}
