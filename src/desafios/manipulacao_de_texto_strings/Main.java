package desafios.manipulacao_de_texto_strings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeDeCodigos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantidadeDeCodigos; i++) {
            String codigoLido = sc.nextLine();
            String codigo = codigoLido.trim();

            //tamanho
            if (codigo.length() != 6) {
                System.out.printf("Codigo %s invalido: tamanho incorreto (%d caracteres).%n", codigo, codigo.length());

            } else if (!codigo.matches("\\d+")) {
                System.out.printf("Codigo %s invalido: contem caracteres nao numericos.%n", codigo);

            } else {
                int soma = 0;
                for (char caractere : codigo.toCharArray()) {
                    soma += Character.getNumericValue(caractere);
                }

                if (soma % 2 != 0) {
                    System.out.printf("Codigo %s invalido: soma dos digitos (%d) e impar.%n", codigo, soma);
                } else {
                    System.out.printf("Codigo %s valido! Soma dos digitos: %d%n", codigo, soma);
                }
            }
        }

        sc.close();
    }
}
