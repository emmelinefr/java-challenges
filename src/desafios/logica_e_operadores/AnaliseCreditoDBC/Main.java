package desafios.logica_e_operadores.AnaliseCreditoDBC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        avaliar se um cliente tem direito a uma linha de crédito especial para expansão de empresas.

        O cliente deve ter faturamento anual superior a R$ 500.000.
        O cliente deve ter mais de 2 anos de fundação da empresa OU possuir uma garantia real (como um imóvel ou veículo homologado).
        O cliente não pode ter restrições ativas no CPF/CNPJ (nome sujo).
         */

        Scanner sc = new Scanner(System.in);

        String empresa = sc.nextLine();
        double faturamentoAnual = sc.nextDouble();
        int tempoDeFundacao = sc.nextInt();
        boolean garantia = sc.nextBoolean();
        boolean restricaoNome = sc.nextBoolean();

        if (faturamentoAnual > 500_000 && (tempoDeFundacao > 2 || garantia == true) && restricaoNome == false) {
            System.out.println("Empresa " + empresa + " APROVADA para a linha de crédito.");
        } else {
            System.out.println("Empresa " + empresa + " REPROVADA. Não atende aos critérios de elegibilidade.");
        }


        sc.close();

    }
}
