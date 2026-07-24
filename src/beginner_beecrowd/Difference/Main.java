package beginner.Difference;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int diference = ((A * B) - (C *D));

        System.out.println("DIFERENCA = " + diference);

        sc.close();

    }
}
