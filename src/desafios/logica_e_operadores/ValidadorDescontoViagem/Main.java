package desafios.logica_e_operadores.ValidadorDescontoViagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //validar quem está elegível ao desconto máximo de forma automatizada.

        String colaborador = sc.nextLine();
        int tempoDeEmpresa = sc.nextInt();
        boolean membroClubePremiun = sc.nextBoolean();
        boolean pacoteInternacional = sc.nextBoolean();
        double valorCompra = sc.nextDouble();
        boolean pendenciaDocumentacao = sc.nextBoolean();

        if ((tempoDeEmpresa > 1 || membroClubePremiun) && (pacoteInternacional || valorCompra > 4000) && !pendenciaDocumentacao) {
            System.out.println("Colaborador " + colaborador + " elegível para o desconto máximo!");
        } else {
            System.out.println("Colaborador " + colaborador + " não cumpre os requisitos para o desconto.");
        }

        sc.close();

    }
}