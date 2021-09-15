package com.loiane.curso_java.aula13.labs;

import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double valorPorHora = scanner.nextDouble();

        System.out.println("Quantas horas você trabalhou neste mês? ");
        double horasTrabalhoAoMes = scanner.nextDouble();

        double salarioMes = valorPorHora * horasTrabalhoAoMes;

        System.out.println("O valor do seu salário neste mês é: " + salarioMes);
    }
}
