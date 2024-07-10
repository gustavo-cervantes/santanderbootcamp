package edu.gustavo.desafiosdeprojeto.desafiosjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        List<String> transacoes = new ArrayList<>(); // Lista para armazenar as transações

        for (int i = 1; i <= quantidadeTransacoes; i++) {
            // Solicitação do tipo de transação e valor
            char tipoTransacao = scanner.next().charAt(0);
            double valorTransacao = scanner.nextDouble();

            // Verifica o tipo de transação e atualiza o saldo da conta
            if (tipoTransacao == 'D' || tipoTransacao == 'd') {
                saldo += valorTransacao;
                transacoes.add(i + ". Deposito de " + valorTransacao); // Adiciona a transação à lista
            } else if (tipoTransacao == 'S' || tipoTransacao == 's') {
                saldo -= valorTransacao;
                transacoes.add(i + ". Saque de " + valorTransacao); // Adiciona a transação à lista
            } else {
                // Se o tipo de transação não for reconhecido, exibe uma mensagem de erro
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--; // Para não contar esta transação
            }
        }

        // Exibe o saldo final e a lista de transações
        System.out.println("\nSaldo: " + saldo);
        System.out.println("\nTransacoes:");
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }

        // Fechamos o scanner para liberar recursos
        scanner.close();
    }
}
