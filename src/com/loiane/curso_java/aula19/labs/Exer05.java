package com.loiane.curso_java.aula19.labs;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Entre com um valor: " + i);

            vetorA[i] = scanner.nextInt();
            vetorB[i] = vetorA[i] * i;

        }

        System.out.println(" Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }

        System.out.println(" ");

        System.out.println(" Vetor B = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.println(vetorB[i] + " ");
        }
    }
}
