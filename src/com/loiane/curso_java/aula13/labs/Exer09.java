package com.loiane.curso_java.aula13.labs;

import java.util.Scanner;

public class Exer09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em graus Farenheit: ");
        double tempF = scanner.nextDouble();

        double grausCelsius = (5 * (tempF - 32) / 9);

        System.out.println("A temperatura " + tempF + " F é igual a " + grausCelsius + "C");

    }
}
