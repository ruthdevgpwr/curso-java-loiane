package com.loiane.curso_java.aula19.labs;

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor da posi��o " + i);
            vetorA[i] = scanner.nextInt();
        }

        int qtdPares = 0;
        for (int i=0; i<vetorA.length; i++){
            if (vetorA[i] % 2 == 0) {
                qtdPares++;
            }
        }

        System.out.println(" Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }

        System.out.println();

        System.out.println("Qtd n�meros pares: " + qtdPares);

    }
}
