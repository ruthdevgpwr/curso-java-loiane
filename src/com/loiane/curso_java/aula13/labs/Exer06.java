package com.loiane.curso_java.aula13.labs;

import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double areaCirculo = Math.PI * Math.pow(raio, 2);

        /* A função Math.pow () retorna a base elevada ao expoente power, ou seja, base expoente. O número da base.
         O expoente usado para elevar a base. Como pow () é um método estático de Math, você sempre irá usá-lo como
         Math.pow (), ao invés de usá-lo como um método de um objeto do tipo Math que você tenha criado
         ( Math não é um construtor). Math - é uma classe */

        System.out.println("A área do círculo é: " + areaCirculo);
    }
}
