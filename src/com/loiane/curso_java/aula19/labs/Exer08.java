package com.loiane.curso_java.aula19.labs;

import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i=0; i< vetorA.length; i++){
            System.out.println("Entre com um valor no Vetor A, na posição " + i);
            vetorA[i] = scanner.nextInt();
        }

        for (int i=0; i< vetorB.length; i++){
            System.out.println("Entre com um valor no Vetor B, na posição " + i);
            vetorB[i] = scanner.nextInt();
        }

        for (int i=0; i< vetorC.length; i++){
            System.out.println("Entre com um valor no Vetor C, na posição " + i);
            vetorC[i] = vetorA[i] * vetorB[i];
        }

        System.out.println(" ");
        System.out.print(" Valor A = " + " ");
        for (int i=0; i< vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println(" ");
        System.out.print(" Valor B = " + " ");
        for (int i=0; i< vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }

        System.out.println(" ");
        System.out.print(" Valor C = " + " ");
        for (int i=0; i< vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }
    }
}
