package com.loiane.curso_java.aula14.labs;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número qualquer: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite outro número: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2){
            System.out.println("O primeiro número é maior:"+ num1);
        } else {
            System.out.println("O número dois é maior:" + num2);
        }
    }
}
