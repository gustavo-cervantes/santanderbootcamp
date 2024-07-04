package edu.gustavo.desafiosdeprojeto.contabancaria;

public abstract class Conta implements IConta{
    protected int agencia;
    protected int numero;
    protected double saldo;

    @Override
    public void sacar(double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sacar'");
    }

    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'depositar'");
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transferir'");
    }


    public int getAgencia(){
        return agencia;
    }

    public int getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }
}
