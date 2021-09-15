package com.loiane.curso_java.aula27.labs;

public class Exer02 {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.numero = "1234";
        conta.saldo = 500;
        conta.especial = false;
        conta.limite = 1000;

//        conta.consultarSaldo();
//        conta.sacar(100);
//        conta.consultarSaldo();
//        conta.depositar(200);
//        conta.verificarEspecial();

        conta.depositar(4000);
        conta.sacar(-200);
    }
}
