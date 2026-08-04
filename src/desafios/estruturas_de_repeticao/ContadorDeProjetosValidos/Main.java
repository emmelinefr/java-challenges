package desafios.estruturas_de_repeticao.ContadorDeProjetosValidos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidadeDeProjetos = sc.nextInt();

        int aprovados = 0;


        for (int i = 0; i < quantidadeDeProjetos; i++) {
            int nota = sc.nextInt();

            if (nota < 0 || nota > 100) {
                System.out.println("Nota inválida! Digite novamente.");
                i--;

            } else if (nota >= 70) {
                aprovados++;
            }
        }

        System.out.println("Total de projetos analisados: " + quantidadeDeProjetos + ". Aprovados: " + aprovados + ".");

        sc.close();


    }
}
