package com.loiane.curso_java.aula11;

public class VariaveisChar {

    public static void main(String[] args) {

        char o = 'o';
        char i = 'i';
        char interrogacao = 0X00E1; // valor '?'

        // System.out.println(o+i); printa - 216
        // como transformar no char
        System.out.println("" + o + i + interrogacao);

        //ou

        //pode fazer o assign dos valores da tabela asc
        // char o = 111;
        // char i = 105;
        // System.out.println(""+o+i); printa - oi

    }

}
