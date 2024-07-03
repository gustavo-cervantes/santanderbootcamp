package edu.gustavo.desafiosdeprojeto.contabancaria;

    private static int SEQUENCIAL = 1;

    public class ContaCorrente extends Conta {
      public ContaCorrente() {
        super.agencia = 1;
        super.numero = SEQUENCIAL++;
    }
}
