package com.loiane.curso_java.aula13.labs;

import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do c�rculo: ");
        double raio = scanner.nextDouble();

        double areaCirculo = Math.PI * Math.pow(raio, 2);

        /* A fun��o Math.pow () retorna a base elevada ao expoente power, ou seja, base expoente. O n�mero da base.
         O expoente usado para elevar a base. Como pow () � um m�todo est�tico de Math, voc� sempre ir� us�-lo como
         Math.pow (), ao inv�s de us�-lo como um m�todo de um objeto do tipo Math que voc� tenha criado
         ( Math n�o � um construtor). Math - � uma classe */

        System.out.println("A �rea do c�rculo �: " + areaCirculo);
    }
}
