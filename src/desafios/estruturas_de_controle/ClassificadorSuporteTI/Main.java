package desafios.estruturas_de_controle.ClassificadorSuporteTI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroDoChamado = sc.nextInt();
        int codigoDoProblema = sc.nextInt();

        boolean codigoValido = true;
        String nomeDaEquipe = "";
        int sla = 0;
        switch (codigoDoProblema) {
            case 1 -> {
                nomeDaEquipe = "Equipe de Infraestrutura";
                sla = 48;
            }
            case 2 -> {
                nomeDaEquipe = "Equipe de Segurança";
                sla = 24;
            }
            case 3 -> {
                nomeDaEquipe = "Equipe de Desenvolvimento";
                sla = 12;
            }
            case 4 -> {
                nomeDaEquipe = "Equipe de DevOps";
                sla = 2;
            }
            default -> {
                codigoValido = false;
                System.out.println("Código de problema inválido. Chamado #" + numeroDoChamado + " retido na triagem.");
            }
        }

        if (codigoValido) {
            System.out.println("Chamado #" + numeroDoChamado + " direcionado para " + nomeDaEquipe + ". SLA: " + sla + "h.");
        }


        sc.close();

    }
}

