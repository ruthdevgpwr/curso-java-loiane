package com.loiane.curso_java.aula14.labs;

import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com  a 1ª nota: ");
        double primeiraNota = scanner.nextDouble();

        System.out.println("Entre com a segunda nota: ");
        double segundaNota = scanner.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;

        String aproveitamento = " ";

        if (media >= 9 && media <= 10) {
            aproveitamento = "A";
        } else if (media >= 7.5 && media < 9) {
            aproveitamento = "B";
        } else if (media >= 6 && media < 7.5) {
            aproveitamento = "C";
        } else if (media >= 4 && media < 6){
            aproveitamento = "D";
        } else if (media >= 0 && media < 4){
            aproveitamento = "E";
        } else {
            aproveitamento = "Valor inválido";
        }

        switch (aproveitamento){
            case "A":
            case "B":
            case "C":
                System.out.println("APROVADO"); break;
            case "D":
            case "E":
                System.out.println("REPROVADO"); break;
        }

        System.out.println("Nota 1: " + primeiraNota);
        System.out.println("Nota 2: " + segundaNota);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + aproveitamento);
    }
}
