package com.loiane.curso_java.aula14.labs;

import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um dia na semana(1 - 7): ");
        int diaSemana = scanner.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("DOMINGO");
                break;
            case 2:
                System.out.println("SEGUNDA");
                break;
            case 3:
                System.out.println("TERÇA");
                break;
            case 4:
                System.out.println("QUARTA");
                break;
            case 5:
                System.out.println("QUINTA");
                break;
            case 6:
                System.out.println(" SEXTA ");
                break;
            case 7:
                System.out.println(" SÁBADO ");
                break;
            default:
                System.out.println("Não é um dia da semana válido ");

        }
    }
}
