package com.loiane.curso_java.aula43.labs;

public class TesteContaEspecial {

    public static void main(String[] args) {

        System.out.println("*** Conta Especial ***");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Conta Especial");
        contaEspecial.setNumConta("3333");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);
        realizarSaque(contaEspecial, 50);
        realizarSaque(contaEspecial, 70);
        realizarSaque(contaEspecial,80);

        System.out.println(contaEspecial);
    }

    private static void realizarSaque(ContaEspecial conta, double valor){
        if (conta.sacar(valor)){
            System.out.println("Saque efetuado com sucesso, novo saldo =" + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de" + valor + "saldo de = " + conta.getSaldo());
        }
    }
}
