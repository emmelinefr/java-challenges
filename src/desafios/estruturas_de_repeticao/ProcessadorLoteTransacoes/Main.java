package desafios.estruturas_de_repeticao.ProcessadorLoteTransacoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidadeDeTransacoes = sc.nextInt();


        double saldoEmConta = 0;
        double totalDepositado = 0;
        double totalSacado = 0;
        for (int i = 1; i <= quantidadeDeTransacoes; i++) {
            int tipoDeTransacao = sc.nextInt(); // 1 = Depósito, 2 = Saque
            double valorDaTransacao = sc.nextDouble();

            if (valorDaTransacao <= 0) {
                System.out.println("Transacao " + i + " invalida: valor deve ser positivo.");

            } else {

                switch (tipoDeTransacao) {
                    case 1 -> {
                        saldoEmConta += valorDaTransacao;
                        totalDepositado += valorDaTransacao;
                    }
                    case 2 -> {
                        if (valorDaTransacao > saldoEmConta) {
                            System.out.println("Transacao " + i + " recusada: saldo insuficiente.");

                        } else {
                            saldoEmConta -= valorDaTransacao;
                            totalSacado += valorDaTransacao;
                        }
                    }
                    default -> {}
                }

            }

        }

        System.out.printf("Lote processado. Saldo Final: R$ %.2f | Total Depositado: R$ %.2f | Total Sacado: R$ %.2f", saldoEmConta, totalDepositado, totalSacado);

        sc.close();

    }
}
