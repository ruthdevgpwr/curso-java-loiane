package com.loiane.curso_java.aula13.labs;

import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto voc� ganha por hora? ");
        double valorPorHora = scanner.nextDouble();

        System.out.println("Quantas horas voc� trabalhou neste m�s? ");
        double horasTrabalhoAoMes = scanner.nextDouble();

        double salarioMes = valorPorHora * horasTrabalhoAoMes;

        System.out.println("O valor do seu sal�rio neste m�s �: " + salarioMes);
    }
}
