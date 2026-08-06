package desafios.vetores_e_matrizes_arrays.AnaliseVendasLoja;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidadeDeProdutos = sc.nextInt();

        double[] valores = new double[quantidadeDeProdutos];
        int produtosValidos = 0;

        for (int i = 1; i <= quantidadeDeProdutos; i++) {
            double valor = sc.nextDouble();

            if (valor <= 0) {
                System.out.printf("Produto %d invalido: valor R$ %.2f deve ser maior que zero.%n", i, valor);

            } else {
                valores[i - 1] = valor;
                produtosValidos++;
            }

        }

        if (produtosValidos > 0) {

            double media = Arrays.stream(valores)
                    .filter(valor -> valor > 0)
                    .average()
                    .orElse(0.0);

            long vendasAcimaDaMedia = Arrays.stream(valores)
                    .filter(valor -> valor > media)
                    .count();

            double maiorValor = Arrays.stream(valores)
                    .filter(valor -> valor > 0)
                    .max()
                    .orElse(0.0);

            int posicaoMaiorValor = 0;
            for (int i = 0; i < valores.length; i++) {
                if (valores[i] == maiorValor) {
                    posicaoMaiorValor = i + 1;
                    break;
                }
            }

            System.out.printf("Vendas Validas: %d | Media: R$ %.2f | Maior Venda: R$ %.2f (Produto %d) | Produtos Acima da Media: %d%n", produtosValidos, media, maiorValor, posicaoMaiorValor, vendasAcimaDaMedia);

        } else {
            System.out.println("Nenhum produto registrou vendas validas.");
        }


        sc.close();

    }
}
