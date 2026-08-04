package desafios.estruturas_de_repeticao.CalculadoraOrcamentoProjetos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double tetoMaximoDoOrcamento = sc.nextDouble();

        double somaDosValoresDosProjetos = 0;
        int contadorDeProjetos = 0;

        while (true) {
            double valorProjeto = sc.nextDouble();

            if (valorProjeto <= 0) {
                break;
            }

            if (valorProjeto + somaDosValoresDosProjetos > tetoMaximoDoOrcamento) {
                break;

            } else {
                somaDosValoresDosProjetos += valorProjeto;
                contadorDeProjetos++;
            }
        }

        System.out.println("Total acumulado: R$ " + somaDosValoresDosProjetos + ". Projetos aceitos: " + contadorDeProjetos + ".");


        sc.close();


    }
}
