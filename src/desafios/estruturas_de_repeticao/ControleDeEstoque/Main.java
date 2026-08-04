package desafios.estruturas_de_repeticao.ControleDeEstoque;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidadeLote = sc.nextInt();

        double somaPesos = 0;
        for (int i = 0; i < quantidadeLote; i++) {
            double pesoUnitario = sc.nextDouble();

            if (pesoUnitario < 1 || pesoUnitario > 5) {
                System.out.println("Peso inválido! O peso deve ser entre 1.0kg e 5.0kg. Digite novamente.");
                i--;
            } else {
                somaPesos += pesoUnitario;
            }

        }

        double mediaPeso = somaPesos / quantidadeLote;

        System.out.println("Média de peso dos notebooks: " + mediaPeso + " kg.");

        sc.close();

    }
}
