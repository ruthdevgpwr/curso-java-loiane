package com.loiane.curso_java.aula13.labs;

import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();

        //area = lado * lado
        double areaDoQuadrado = Math.pow(lado, 2);

        System.out.println("A �rea do quadrado �: " + areaDoQuadrado);
        System.out.println("O dobro da �rea do quadrado �: " + (areaDoQuadrado * 2));
    }
}
