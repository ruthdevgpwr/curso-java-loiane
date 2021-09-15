package com.loiane.curso_java.aula13.labs;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de metros: ");
        double metros = scanner.nextDouble();

       /* System.out.println("Digite a quantidade de centímetros: ");
        double cm = scanner.nextDouble();*/

        double cm = metros * 100;
        System.out.println(metros + "m é igual a " + cm + "cm");
    }
}
