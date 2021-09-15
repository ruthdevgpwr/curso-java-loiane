package com.loiane.curso_java.aula14.labs;

import java.util.Scanner;

public class Exer15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o lado 1: ");
        int lado1 = scanner.nextInt();

        System.out.println("Entre com o lado 2: ");
        int lado2 = scanner.nextInt();

        System.out.println("Entre com o lado 3: ");
        int lado3 = scanner.nextInt();

        if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)){

            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                System.out.println("Triângulo Equilátero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2){
                System.out.println("Triângulo Escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Triângulo Isósceles");
            }
        } else {
            System.out.println("Não forma uma triângulo");
        }
    }
}
