package com.loiane.curso_java.aula13.labs;

import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();

        //area = lado * lado
        double areaDoQuadrado = Math.pow(lado, 2);

        System.out.println("A área do quadrado é: " + areaDoQuadrado);
        System.out.println("O dobro da área do quadrado é: " + (areaDoQuadrado * 2));
    }
}
