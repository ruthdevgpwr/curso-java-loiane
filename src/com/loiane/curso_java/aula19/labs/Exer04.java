package com.loiane.curso_java.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[4];
        double[] vetorB = new double[vetorA.length];

        for (int i=0; i<vetorA.length; i++) {
            System.out.print(" Entre com o valor da posição " + i + ": ");
            vetorA[i] = scanner.nextInt();

            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.print(" Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");


        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.print(" Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(df.format(vetorB[i]) + " ");
        }


    }
}
