package com.loiane.curso_java.aula14.labs;

import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1� n�mero: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o 2� n�mero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Digite o 3� n�mero: ");
        double num3 = scanner.nextDouble();

        if (num1 >= num2 && num1 >= num3){
            System.out.println("O n�mero 1 � maior: " + num1);
        } else if (num2 >= num1 && num2 >= num3){
            System.out.println(" O n�mero 2 � maior: " + num2);
        } else {
            System.out.println("O n�mero 3 � maior: " + num3);
        }

        if (num1 <= num2 && num1 <= num2) {
            System.out.println("O n�mero 1 � o menor: " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("O n�mero 2 � o menor: " + num1);
        } else if (num3 <= num1 && num3 <= num2){
            System.out.println("O n�mero 3 � o menor: " + num1);
        }
    }
}
