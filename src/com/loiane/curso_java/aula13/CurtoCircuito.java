package com.loiane.curso_java.aula13;

public class CurtoCircuito {

    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso &
                verdadeiro;
        boolean resultado2 = falso &&
                verdadeiro;

        System.out.println(resultado1);
        System.out.println(resultado2);

        // Ordem de preced�ncia - prioridade � dos par�nteses
        int resultado = 1 + 1 - 1 + 1 * 1 / 1;
        System.out.println(resultado);
    }
}
