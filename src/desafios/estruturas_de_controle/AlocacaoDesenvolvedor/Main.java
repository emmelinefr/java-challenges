package desafios.estruturas_de_controle.AlocacaoDesenvolvedor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        //alocar profissionais a projetos
        //cada projeto tem uma px minima
        //px = anos de experiencia + numero de tecnologias que domina

        String desenvolvedor = sc.nextLine();
        int anosDeExperiencia = sc.nextInt();
        int quantidadeDeTecnologias = sc.nextInt();
        int pontuacaoMinima = sc.nextInt();

        int px;

        if (anosDeExperiencia < 2) {
            px = (anosDeExperiencia * 10) + (quantidadeDeTecnologias * 5);
        } else if (anosDeExperiencia >= 2 && anosDeExperiencia <=5) {
            px = (anosDeExperiencia * 15) + (quantidadeDeTecnologias * 8);
        } else {
            px = (anosDeExperiencia * 20) + (quantidadeDeTecnologias * 10);
        }

        if (px >= pontuacaoMinima) {
            System.out.println("Dev " + desenvolvedor + " aprovado para o projeto com " + px + " pontos!");
        } else if ((pontuacaoMinima - px) <= 5) {
            int diferenca = pontuacaoMinima - px;
            System.out.println("Dev " + desenvolvedor + " ficou em lista de espera (Faltaram apenas " + diferenca + " pontos).");
        } else {
            System.out.println("Dev " + desenvolvedor + " reprovado para este projeto.");
        }

        sc.close();
    }
}
