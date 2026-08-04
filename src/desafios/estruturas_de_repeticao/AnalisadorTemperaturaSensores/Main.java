package desafios.estruturas_de_repeticao.AnalisadorTemperaturaSensores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int numeroDeLeituras = sc.nextInt();

        double somaDasTemperaturas = 0;
        double maiorTemperatura = 0;
        double menorTemperatura = 0;
        int leiturasValidas = 0;

        for (int i = 1; i <= numeroDeLeituras; i++) {
            double temperatura = sc.nextDouble();

            if (temperatura < -50 || temperatura > 100) {
                System.out.printf("Leitura %d invalida: %.1f °C fora dos limites.%n", i, temperatura);

            } else {
                somaDasTemperaturas += temperatura;

                if (leiturasValidas == 0) {
                    maiorTemperatura = temperatura;
                    menorTemperatura = temperatura;

                } else {
                    if (temperatura > maiorTemperatura) {
                        maiorTemperatura = temperatura;
                    }

                    if (temperatura < menorTemperatura) {
                        menorTemperatura = temperatura;
                    }
                }

                leiturasValidas++;

            }
        }


        if (leiturasValidas > 0) {
            double mediaDasTemperaturas = somaDasTemperaturas / leiturasValidas;

            System.out.printf("Leituras validas: %d | Media: %.1f °C | Maior: %.1f °C | Menor: %.1f °C%n",
                    leiturasValidas, mediaDasTemperaturas, maiorTemperatura, menorTemperatura);
        } else {
            System.out.println("Nenhuma leitura valida foi registrada.");
        }

        sc.close();

    }
}
