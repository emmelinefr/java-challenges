package beginner.CalculoSimples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigoPeca1 = sc.nextInt();
        int numeroDePeças1 = sc.nextInt();
        double valorUnitarioPeca1 = sc.nextDouble();

        int codigoPeca2 = sc.nextInt();
        int numeroDePeças2 = sc.nextInt();
        double valorUnitarioPeca2 = sc.nextDouble();

        double valorPagar = (valorUnitarioPeca1 * numeroDePeças1) + (valorUnitarioPeca2 * numeroDePeças2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagar);

        sc.close();

    }
}
