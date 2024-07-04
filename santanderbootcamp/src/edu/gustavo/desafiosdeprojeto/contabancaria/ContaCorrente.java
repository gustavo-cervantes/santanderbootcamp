package edu.gustavo.desafiosdeprojeto.contabancaria;

public class ContaCorrente extends Conta {
    
    private static final int SEQUENCIAL = 0;

    public ContaCorrente() {
        super.agencia = 1;
        super.numero = SEQUENCIAL;
    }

}
