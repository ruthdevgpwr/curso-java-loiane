package com.loiane.curso_java.aula27.labs;

public class ContaCorrente {

    String numero;
    double saldo;
    boolean especial;
    double limite;

    void sacar(double valor) {
        if (valor <= saldo && valor <= limite) {
            saldo -= valor;
        }
        if (valor <= 0) {
            System.out.println("Erro");
        }
    }

    void consultarSaldo() {
        System.out.println(saldo);
    }

    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro, você não pode depositar valor negativo");
        } else {
            saldo += valor;
            System.out.println(saldo);
        }

    }

    boolean verificarEspecial() {
        if (especial) {
            System.out.println("O cliente está usando cheque especial");
        } else {
            System.out.println("O cliente não está usando cheque especial");
        }
        return especial;
    }
}

