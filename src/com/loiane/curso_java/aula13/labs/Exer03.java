package com.loiane.curso_java.aula13.labs;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1� n�mero: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o 2� n�mero: ");
        double numero2 = scanner.nextDouble();

        double soma = numero1 + numero2;
        System.out.println("A soma entre os dois n�meros �: " + soma);
    }
}
