package desafios.estruturas_de_controle.CalculadoraBonusDBC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String colaborador = sc.nextLine();
        double salario = sc.nextDouble();
        boolean metaAtingida = sc.nextBoolean();
        int notaDesempenhoIndividual = sc.nextInt();

        double valorPorcentagem = 0;

        //modo 1
        if (metaAtingida) {
            if (notaDesempenhoIndividual == 1 || notaDesempenhoIndividual == 2) {
                valorPorcentagem = 5;

            } else if (notaDesempenhoIndividual == 3 || notaDesempenhoIndividual == 4) {
                valorPorcentagem = 15;

            } else {
                valorPorcentagem = 20;
            }

        } else {
            if (notaDesempenhoIndividual < 4) {
                valorPorcentagem = 0;
            } else {
                valorPorcentagem = 10;
            }
        }

        double valorBonus = (valorPorcentagem / 100) * salario;

        if (valorPorcentagem > 0) {
            System.out.println("Colaborador " + colaborador + " receberá R$ " + valorBonus + " de bônus.");
        } else {
            System.out.println("Colaborador " + colaborador + " não elegível para bônus este ano.");
        }

        //===================================================================================================

        /*

        //modo 2
        if (metaAtingida) {
            switch (notaDesempenhoIndividual) {
                case 1, 2 -> valorPorcentagem = 5;
                case 3, 4 -> valorPorcentagem = 15;
                case 5 -> valorPorcentagem = 20;
                default -> valorPorcentagem = 0;
            }

        } else {
            switch (notaDesempenhoIndividual) {
                case 4, 5 -> valorPorcentagem = 10;
                default -> valorPorcentagem = 0;
            }
        }

        double valorBonus = (valorPorcentagem / 100) * salario;

        if (valorPorcentagem > 0) {
            System.out.println("Colaborador " + colaborador + " receberá R$ " + valorBonus + " de bônus.");
        } else {
            System.out.println("Colaborador " + colaborador + " não elegível para bônus este ano.");
        }

         */

        sc.close();

    }
}
