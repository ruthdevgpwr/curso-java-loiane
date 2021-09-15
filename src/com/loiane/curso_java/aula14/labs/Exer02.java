package com.loiane.curso_java.aula14.labs;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = scanner.nextDouble();

        if (num >= 0){
            System.out.println("O número que você escolheu é POSITIVO.");
        } else {
            System.out.println("O número que você escolheu é NEGATIVO.");
        }
    }
}