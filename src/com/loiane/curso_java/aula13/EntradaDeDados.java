package com.loiane.curso_java.aula13;

import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Digite o seu nome completo: ");
//        String nomeCompleto = scanner.nextLine();
//        System.out.println("Seu nome completo �: " + nomeCompleto);

        /*System.out.println("Digite o seu nome completo: ");
        String nome = scanner.nextLine();
        String primeiroNome = nome.split(" ")[0];
        System.out.println("Seu primeiro nome �: " + primeiroNome);*/


        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("A sua idade �: " + idade);

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("A sua altura �: " + altura);

        System.out.println("Digite a sua idade, quantidade de filhos, alturas e sem tem um bichinho de estima��o");
        byte qtdFilhos = scanner.nextByte();
        boolean temPet = scanner.hasNextBoolean();

        System.out.println("Voc� digitou os seguintes valores: ");
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Tem bichinho de estima��o? " + temPet);
    }
}