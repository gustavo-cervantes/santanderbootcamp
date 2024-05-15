package edu.gustavo.estruturascondicionais;

public class ResultadoEscolar {
    public static void main(String[] args) {
        
        int nota = 7;

        if (nota >= 7)
        System.out.println("Aluno aprovado!");

        else if (nota >= 5 && nota< 7) // true ou false
        System.out.println("Prova de recuperação");

        else
        System.out.println("Aluno reprovado");
    }
}
