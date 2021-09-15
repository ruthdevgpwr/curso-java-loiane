package com.loiane.curso_java.aula43.labs;

public class Teste {

    public static void main(String[] args) {
        System.out.println("*** Teste Conta Bancária ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente conta simples");
        contaSimples.setNumConta("11111");

        contaSimples.depositar(100);

        realizarSaque(contaSimples, 50);

        realizarSaque(contaSimples, 70);

        System.out.println(contaSimples);
    }

    private static void realizarSaque(ContaBancaria conta, double valor){
        if (conta.sacar(valor)){
            System.out.println("Saque efetuado com sucesso, novo saldo =" + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de" + valor + "saldo de = " + conta.getSaldo());
        }
    }
}
