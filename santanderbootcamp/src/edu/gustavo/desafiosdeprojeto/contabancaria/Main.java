package edu.gustavo.desafiosdeprojeto.contabancaria;

public class Main {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaCorrente();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
    
}
