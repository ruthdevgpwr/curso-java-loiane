package com.loiane.curso_java.aula14.labs;

import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual � o pre�o da margarina? ");
        double margarina = scanner.nextDouble();
        System.out.println("Qual � o pre�o do feij�o? ");
        double feijao = scanner.nextDouble();
        System.out.println("Qual � o pre�o do arroz? ");
        double arroz = scanner.nextDouble();

        if (margarina <= feijao && margarina <= arroz){
            System.out.println("Compre a margarina: " + margarina + "reais");
        } else if (feijao <= margarina && feijao <= arroz){
            System.out.println("Compre o feijao: " + feijao + "reais");
        } else {
            System.out.println("Compre o arroz: " + arroz + "reais");
        }
    }
}
