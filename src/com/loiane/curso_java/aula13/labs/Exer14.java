package com.loiane.curso_java.aula13.labs;

import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do arquivo em MB: ");
        double tamanhoArq = scanner.nextDouble();

        System.out.println("Qual é a velocidade do link da internet?: ");
        double velocidaddeNet = scanner.nextDouble();

        double tempo = tamanhoArq / velocidaddeNet;

        System.out.println("Tempo de download: " + tempo + " minutos.");
    }
}
