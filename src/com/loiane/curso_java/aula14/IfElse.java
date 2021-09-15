package com.loiane.curso_java.aula14;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você maior de idade");
        } else {
            System.out.println("Não é maior de idade");
        }
    }
}
