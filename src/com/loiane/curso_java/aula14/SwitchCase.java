package com.loiane.curso_java.aula14;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia da semana (1 - 7): ");
        int diaSemana = scanner.nextInt();

        /*if (diaSemana == 1) {
            System.out.println("Domingo");
        } else if (diaSemana == 2) {
            System.out.println("Segunda");
        } else if (diaSemana == 3) {
            System.out.println("Ter�a");
        } else if (diaSemana == 4) {
            System.out.println("Quarta");
        } else if (diaSemana == 5) {
            System.out.println("Quinta");
        } else if (diaSemana == 6) {
            System.out.println("Sexta");
        } else if (diaSemana == 7) {
            System.out.println("S�bado");
        } else {
            System.out.println("N�o � um dia da semana v�lido.");
        }*/


        // outra utiliza��o do break

        switch(diaSemana){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia �til"); break;
            case 1:
            case 7:
                System.out.println("Fim de semana"); break;
            default:
                System.out.println("N�o � um dia da semana v�lido.");
        }
    }
}
