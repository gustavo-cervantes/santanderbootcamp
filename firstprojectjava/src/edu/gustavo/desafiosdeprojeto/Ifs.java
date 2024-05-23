package edu.gustavo.desafiosdeprojeto;
import java.util.Scanner;

public class Ifs {
    public static void main(String[] args) {
        Scanner leitordeEntradas = new Scanner(System.in);
        float valorSalario = leitordeEntradas.nextFloat();
        float valorBeneficios = leitordeEntradas.nextFloat();

        float valorImposto = 0;

            // de R$0,00 a R$1100.00
        if (valorSalario >=0 && valorSalario <= 1100) {
            valorImposto = 0.05F * valorSalario;
            // de R$1100.01 a R$2500.00
        }else if (valorSalario >=1100.01 && valorSalario <= 2500.00) {
            valorImposto = 0.10F * valorSalario;
            // acima de R$2500.00    
        } else { 
            valorImposto = 0.15F * valorSalario;
        }

        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format(".2f", saida));
    }
}
