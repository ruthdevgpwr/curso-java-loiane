package com.loiane.curso_java.aula14.labs;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um n�mero: ");
        double num = scanner.nextDouble();

        if (num >= 0){
            System.out.println("O n�mero que voc� escolheu � POSITIVO.");
        } else {
            System.out.println("O n�mero que voc� escolheu � NEGATIVO.");
        }
    }
}