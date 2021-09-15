package com.loiane.curso_java.aula14.labs;

import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da sua hora de trabalho: ");
        double salHora = scanner.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double horaTrabalhadaNoMes = scanner.nextDouble();

        double salarioBruto = salHora * horaTrabalhadaNoMes;
        int percentualIr = 0;

        if (salarioBruto <= 900) {
            percentualIr = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            percentualIr = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            percentualIr = 10;
        } else if (salarioBruto > 2500) {
            percentualIr = 20;
        }

        double ir = (salarioBruto / 100) * percentualIr;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salario Bruto: (" + salHora + "*" + horaTrabalhadaNoMes + "): " + salarioBruto);
        System.out.println("(-) IR (" + percentualIr + "%):" + ir);
        System.out.println("(-) INSS (10%):" + inss);
        System.out.println("(-) FGTS (11%):" + fgts);
        System.out.println("Total de Descontos: " + totalDescontos);
        System.out.println("Salário Líquido:" + salarioLiquido);
    }
}
