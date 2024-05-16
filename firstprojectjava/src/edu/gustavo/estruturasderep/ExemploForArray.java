package edu.gustavo.estruturasderep;

public class ExemploForArray {
    public static void main(String[] args) {

        // em arrays o indice inicia sempre em 0/ZERO
        String alunos [] = { "FELIPE", "JONAS", "GUSTAVO", "GABRIELA"};

        for (int x=0; x < alunos.length; x++) {
            
            System.out.println("O aluno no indice x =" + x + " é " + alunos [ x ]);
        }
    }
}
