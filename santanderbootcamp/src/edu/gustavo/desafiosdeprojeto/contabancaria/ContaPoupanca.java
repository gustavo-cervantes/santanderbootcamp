package edu.gustavo.desafiosdeprojeto.contabancaria;

public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Poupanca: Ok");
        super.imprimirInfos();
    }
}
