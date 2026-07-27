package desafios.logica_e_operadores.ValidadorAcessoServidor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // validação de acesso a um servidor de arquivos confidenciais.

        String cargo = sc.nextLine();
        boolean vpn = sc.nextBoolean();
        boolean token2fa = sc.nextBoolean();
        boolean contaSuspensa = sc.nextBoolean();;

        if ((cargo.equalsIgnoreCase("admin") || cargo.equalsIgnoreCase("gestor"))
                && (vpn || token2fa)
                && !contaSuspensa) {
            System.out.println("Acesso concedido ao servidor confidencial.");

        } else {
            System.out.println("Acesso negado. Credenciais inválidas ou conta suspensa.");
        }

        sc.close();
    }
}
