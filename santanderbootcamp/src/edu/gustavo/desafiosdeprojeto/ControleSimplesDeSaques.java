package edu.gustavo.desafiosdeprojeto;
import java.util.Scanner;
public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        // Faço uma conversão explicita para utilizar o valor como contador no laço for
        int counter = (int) limiteDiario;
        //iterando
        for (int i = 0; i < counter; i++) {
            //recebendo o valor do saque
            double saque = scanner.nextDouble();
            //Devido a estarmos num laço valido se o valor inserido é zero caso sim encerramos o laço através do Break
            if (saque <= 0) {
                System.out.println("Transacoes encerradas.");
                break;
                //se o valor inserido do saque for maior que zero e menor que o limiteDiario eu faço o saque e continuo o laço;    
            } else if (saque > 0 && saque <= limiteDiario) {
                limiteDiario -= saque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
                //Em outro caso encerramos a aplicação 
            } else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
        }
        scanner.close();
    }
}

