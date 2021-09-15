package com.loiane.curso_java.aula14;

import java.util.Scanner;

public class ComprarItemIfElse {

    public static void main(String[] args) {

        //barato <= 10
        //10 < valor < 15 - pedir desconto
        //15 <= valor 17 - pesquisar mais
        // >= 17 - muito caro

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor do item?");
        double valor = scanner.nextDouble();

        if (valor <= 10){
            System.out.println("Est� barato, pode comprar.");
        } else if (valor < 10 && valor < 15){
            System.out.println("Voc� pode pedir um desconto.");
        } else if (valor >= 15 && valor < 17){
            System.out.println("Voc� pode pesquisar mais.");
        } else { // valor >= 17
            System.out.println("N�o compre. Muito caro!!");
        }
    }
}
