package desafios.vetores_e_matrizes_arrays.ControleTemperaturaEstufa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroDeMedicoes = sc.nextInt();

        double[] temperaturas = new double[numeroDeMedicoes];
        int numTemperaturasValidas = 0;

        for (int i = 1; i <= numeroDeMedicoes; i++) {
            double temperatura = sc.nextDouble();

            if (temperatura < -10.0 || temperatura > 60.0) {
                System.out.printf("Medicao %d invalida: %.1f C fora da faixa permitida.%n", i, temperatura);
                temperaturas[i - 1] = Double.NaN;

            } else {
                temperaturas[i  - 1] = temperatura;
                numTemperaturasValidas++;
            }
        }

        if (numTemperaturasValidas > 0) {

            //media
            double mediasDasTemperaturas = Arrays.stream(temperaturas)
                    .filter(temp -> temp >= -10.0 && temp <= 60.0)
                    .average()
                    .orElse(0.0);

            //menorValida
            double menorTemperaturaValida = Arrays.stream(temperaturas)
                    .filter(temp -> temp >= -10.0 && temp <= 60.0)
                    .min()
                    .orElse(0.0);

            //posicaoMenorValida
            int posicaoMenorTemperaturaValida = 0;
            for (int i = 0; i < temperaturas.length; i++) {
                if (temperaturas[i] == menorTemperaturaValida) {
                    posicaoMenorTemperaturaValida = i + 1;
                    break;
                }
            }

            //medicoesAbaixoDaMedia
            long medicoesAbaixoDaMedia = Arrays.stream(temperaturas)
                    .filter(temp -> !Double.isNaN(temp) && temp < mediasDasTemperaturas)
                    .count();


            System.out.printf("Medicoes Validas: %d | Media: %.1f C | Menor Temp: %.1f C (Medicao %d) | Medicao Abaixo da Media: %d%n", numTemperaturasValidas, mediasDasTemperaturas, menorTemperaturaValida, posicaoMenorTemperaturaValida, medicoesAbaixoDaMedia);

        } else {
            System.out.println("Nenhuma medicao valida registrada.");
        }


        sc.close();
    }
}
