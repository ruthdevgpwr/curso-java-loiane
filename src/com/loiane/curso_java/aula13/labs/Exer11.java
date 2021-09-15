package com.loiane.curso_java.aula13.labs;

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1ª número inteiro: ");
        int numInt1 = scanner.nextInt();
        System.out.println("Digite o 2ª número inteiro: ");
        int numInt2 = scanner.nextInt();
        System.out.println("Digite um número real: ");
        float numReal = scanner.nextFloat();

        int resultado1 = (numInt1 * 2) * (numInt2 / 2);
        double resultado2 = (numInt1 * 3) + numReal;
        double resultado3 = Math.pow(numReal, 3);

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2:  " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
    }
}
