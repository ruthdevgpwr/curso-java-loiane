package com.loiane.curso_java.aula13.labs;

import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em graus Celsius: ");
        double gCelsius = scanner.nextDouble();

        double gFar = (gCelsius * 1.8) + 32;

        System.out.println("A temperatura " + gCelsius + "C é igual a " + gFar + " F");
    }
}
