package desafios.estruturas_de_repeticao.SistemaAtendimentoDBC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int menu;

        do {
            System.out.println("MENU" +
                    "\n1 - Falar com o RH" +
                    "\n2 - Falar com o TI" +
                    "\n3 - Modificar Dados Cadastrais" +
                    "\n0 - Sair do Sistema");
            menu = sc.nextInt();
            sc.nextLine();


            switch (menu) {
                case 1 -> System.out.println("Direcionando para o RH...");
                case 2 -> System.out.println("Direcionando para o TI...");
                case 3 -> System.out.println("Abrindo painel de cadastro...");
                case 0 -> {}

                default -> System.out.println("Opção inválida! Tente novamente.");
            }


        } while (menu != 0);

        System.out.println("Sistema encerrado. Até logo!");


        sc.close();

    }
}
