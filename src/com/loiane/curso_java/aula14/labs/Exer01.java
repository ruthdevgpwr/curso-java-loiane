package com.loiane.curso_java.aula14.labs;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um n�mero qualquer: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite outro n�mero: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2){
            System.out.println("O primeiro n�mero � maior:"+ num1);
        } else {
            System.out.println("O n�mero dois � maior:" + num2);
        }
    }
}
