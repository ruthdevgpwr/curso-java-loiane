package com.loiane.curso_java.aula14.labs;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       /* System.out.println("Digite F (feminino) e M(masculino)");
        String sexo = scanner.nextLine();

        if (sexo.equals("F") || sexo.equals("f")){
            System.out.println("Feminino");
        } else if (sexo.equals("M") || sexo.equals("m")){
            System.out.println("Masculino");
        } else {
            System.out.println("Sexo inválido");
        }*/

        System.out.println("Digite F (feminino) e M(masculino)");
        String sexo = scanner.nextLine(); //String - Classe em Java e não um tipo primitivo

        if (sexo.equalsIgnoreCase("F")){
            System.out.println("Feminino");
        } else if (sexo.equalsIgnoreCase("M")){
            System.out.println("Masculino");
        } else {
            System.out.println("Sexo inválido");
        }

    }
}
