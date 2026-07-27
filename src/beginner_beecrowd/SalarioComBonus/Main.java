package beginner_beecrowd.SalarioComBonus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String vendedor = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalDeVendas = sc.nextDouble();

        double aumento = (totalDeVendas * 0.15);
        double salarioFinal = salarioFixo + aumento;

        System.out.printf("TOTAL = R$ %.2f%n", salarioFinal);



        sc.close();

    }
}
