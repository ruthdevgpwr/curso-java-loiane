package com.loiane.curso_java.aula13.labs;

import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----- MÉDIA DO ALUNO ----");

        System.out.println("Digite a 1ª nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a 2ª nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a 3ª nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a 4ª nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média do aluno é: " + media);
    }
}
