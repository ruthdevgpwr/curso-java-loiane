package com.loiane.curso_java.aula14.labs;

import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o turno que você estuda - M(matutino) - V (vespertino) - N (noturno) : ");
        String turno = scanner.next();

        switch(turno){
            case "m":
            case "M":
                System.out.println("Bom dia!"); break;
            case "v":
            case "V":
                System.out.println("Boa tarde"); break;
            case "n":
            case "N":
                System.out.println("Boa noite!"); break;
            default:
                System.out.println("Valor inválido");
        }
    }
}
