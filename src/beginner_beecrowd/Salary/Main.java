package beginner.Salary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorPorHora = sc.nextDouble();

        double salario = valorPorHora * horasTrabalhadas;

        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", numeroFuncionario, salario);

        sc.close();

    }
}
