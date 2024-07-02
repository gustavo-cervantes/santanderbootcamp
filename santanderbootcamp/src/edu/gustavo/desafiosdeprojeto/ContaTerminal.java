package edu.gustavo.desafiosdeprojeto;

import java.util.Scanner;

public class ContaTerminal {

    // Atributos da conta
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    // Método principal (ponto de entrada do programa)
    public static void main(String[] args) {
        // Criar objeto ContaTerminal
        ContaTerminal contaTerminal = new ContaTerminal();

        // Coletar dados da conta do cliente
        contaTerminal.coletarDadosConta();

        // Exibir mensagem final com detalhes da conta
        contaTerminal.exibirMensagemFinal();
    }

    // Método para coletar dados da conta do cliente
    private void coletarDadosConta() {
        try (// Criar objeto Scanner para leitura de entrada
        Scanner scanner = new Scanner(System.in)) {
            // Solicitar e ler número da conta
            System.out.print("Por favor, digite o número da conta: ");
            numeroConta = scanner.nextInt();

            // Solicitar e ler agência
            System.out.print("Por favor, digite a agência: ");
            agencia = scanner.next();

            // Limpar o buffer do scanner (para evitar problemas na leitura do nome)
            scanner.nextLine();

            // Solicitar e ler nome do cliente
            System.out.print("Por favor, digite o nome do cliente: ");
            nomeCliente = scanner.nextLine();

            // Solicitar e ler saldo
            System.out.print("Por favor, digite o saldo inicial: ");
            saldo = scanner.nextDouble();
        }
    }

    // Método para exibir mensagem final com detalhes da conta
    private void exibirMensagemFinal() {
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
