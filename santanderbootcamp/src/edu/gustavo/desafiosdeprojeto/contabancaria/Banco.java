package edu.gustavo.desafiosdeprojeto.contabancaria;

import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;      // composicao referenciar um obj dentro de outro

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
