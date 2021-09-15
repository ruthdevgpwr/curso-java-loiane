package com.loiane.curso_java.aula19.labs;

import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A, da posição " + i);

            vetorA[i] = scanner.nextInt();
            vetorC[i] = vetorA[i] - vetorB[i];
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor B, da posição " + i);

            vetorB[i] = scanner.nextInt();
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");

        }

        System.out.println(" ");

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println(" ");

        System.out.print("Vetor C = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}