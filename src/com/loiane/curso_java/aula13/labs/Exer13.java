package com.loiane.curso_java.aula13.labs;

import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto voc� ganha por hora? ");
        double salHora = scanner.nextDouble();

        System.out.println("Quantas horas voc� trabalhou neste m�s? ");
        double horaTrabalhadaNoMes = scanner.nextDouble();

        double salarioBruto = salHora * horaTrabalhadaNoMes;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto/100) * 5;
        double ir = (salarioBruto/100) * 11;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Sal�rio Bruto: " + salarioBruto);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("IR: " + ir);
        System.out.println("Total de Descontos: " + totalDescontos);
        System.out.println("Sal�rio l�quido: " + salarioLiquido);

    }
}

