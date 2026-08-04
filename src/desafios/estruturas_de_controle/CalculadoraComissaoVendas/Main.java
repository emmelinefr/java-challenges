package desafios.estruturas_de_controle.CalculadoraComissaoVendas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double metaDeVendas = sc.nextDouble();
        double totalVendido = sc.nextDouble();
        int categoria = sc.nextInt();


        double comissaoBase = 0;

        boolean categoriaValida = true;
        switch (categoria) {
            case 1 -> comissaoBase = 5;
            case 2 -> comissaoBase = 8;
            case 3 -> comissaoBase = 12;
            default -> {
                categoriaValida = false;
                System.out.println("Categoria de vendedor inválida. Processamento cancelado.");
            }
        }




        if (categoriaValida) {

            double porcentagemComissaoFinal = comissaoBase / 100;
            double aReceber = totalVendido * porcentagemComissaoFinal;

            double salarioComBonus;
            if (totalVendido >= metaDeVendas) {
                double bonusExtra = 500;
                salarioComBonus = aReceber + bonusExtra;

            } else {
                salarioComBonus = aReceber;
            }

            System.out.printf("Vendedor Categoria %d - Total a receber: R$ %.2f", categoria, salarioComBonus);

        }






        sc.close();


    }
}
