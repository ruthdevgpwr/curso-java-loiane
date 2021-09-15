package com.loiane.curso_java.aula14.labs;

import java.util.Scanner;

public class Exer09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1º número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o 2º número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Digite o 3º número: ");
        double num3 = scanner.nextDouble();

        if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
            //num1 é menor
            //num3 é maior
            //num1 < num2 < num3
            System.out.println(num3 + "-" + num2 + "-" + num1);
        } else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
            //num1 menor
            //num2 maior
            //num 1 < num3 < num2
            System.out.println(num2 + "-" + num3 + "-" + num1);
        } else if (num2 <= num1 && num2 <= num3 && num1 <= num2) {
            //num3 maior
            //num2 menor
            //num 2 < num1 < num3
            System.out.println(num3 + "-" + num1 + "-" + num2);
        } else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
            //num1 maior
            //num2 menor
            //num2 < num3 < num1
            System.out.println(num1 + "-" + num3 + "-" + num2);
        } else if (num3 <= num1 && num2 <= num3 && num3 <= num1) {
            //num3 menor
            //num1 maior
            //num3 < num2 < num1
            System.out.println(num1 + "-" + num2 + "-" + num3);
        }
    }
}


