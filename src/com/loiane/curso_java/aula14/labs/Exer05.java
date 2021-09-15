package com.loiane.curso_java.aula14.labs;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a 1ª nota do Aluno: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a 2ª nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2)/2;

        if (media == 10){
            System.out.println("Aprovado com DISTINÇÃO");
        } else if (media >= 7){
            System.out.println("Aluno APROVADO");
        } else {
            System.out.println("Aluno REPROVADO");
        }
    }
}
