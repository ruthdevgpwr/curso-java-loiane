package com.loiane.curso_java.aula19.labs;

import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i=0; i < vetorA.length; i++){
            System.out.println("Entre com um valor no Vetor A, posição " + i);
            vetorA[i] = scanner.nextInt();
        }

        int soma = 0;
        int impares = 0;
        for (int i=0; i< vetorA.length; i++){
            if (vetorA[i] %  2 != 0){
                soma += vetorA[i];
                impares++;
            }
        }

        System.out.println("Vetor A = ");
        for (int i=0; i< vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }

        System.out.println();

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + (soma/impares));

    }
}
