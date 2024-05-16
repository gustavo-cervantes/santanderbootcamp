package edu.gustavo.estruturasderep;

public class ExemploForArray {
    public static void main(String[] args) {

        // em arrays o indice inicia sempre em 0/ZERO
        String alunos [] = { "FELIPE", "JONAS", "GUSTAVO", "GABRIELA"};

        for (String aluno: alunos) {
            System.out.println("Nome do aluno é: " + aluno );
        }
    }
}
