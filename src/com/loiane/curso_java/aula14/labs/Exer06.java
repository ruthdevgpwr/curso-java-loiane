package com.loiane.curso_java.aula14.labs;

import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1º número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o 2º número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Digite o 3º número: ");
        double num3 = scanner.nextDouble();

        if (num1 >= num2 && num1 >= num3){
            System.out.println("O número 1 é maior: " + num1);
        } else if (num2 >= num1 && num2 >= num3){
            System.out.println(" O número 2 é maior: " + num2);
        } else {
            System.out.println("O número 3 é maior: " + num3);
        }

        if (num1 <= num2 && num1 <= num2) {
            System.out.println("O número 1 é o menor: " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("O número 2 é o menor: " + num1);
        } else if (num3 <= num1 && num3 <= num2){
            System.out.println("O número 3 é o menor: " + num1);
        }
    }
}
