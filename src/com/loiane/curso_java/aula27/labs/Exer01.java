package com.loiane.curso_java.aula27.labs;

public class Exer01 {

    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.ligar();

        lampada.mostrarEstado();

//        if (lampada.ligada) {
//            System.out.println("A lâmpada está ligada");
//        } else {
//            System.out.println("A lâmpada está desligada");
//        }

        lampada.desligar();

        lampada.mostrarEstado();

//        if (lampada.ligada) {
//            System.out.println("A lâmpada está ligada");
//        } else {
//            System.out.println("A lâmpada está desligada");
//        }

        lampada.mudarEstado();

        lampada.mostrarEstado();
    }
}
