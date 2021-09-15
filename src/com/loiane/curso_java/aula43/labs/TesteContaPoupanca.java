package com.loiane.curso_java.aula43.labs;

public class TesteContaPoupanca {

    public static void main(String[] args) {

        System.out.println(" *** Teste Conta Poupança ***");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Cliente Conta Poupança");
        contaPoupanca.setNumConta("2222");
        contaPoupanca.setDiaRendimento(11);

        contaPoupanca.depositar(100);

        realizarSaque(contaPoupanca, 50);

        realizarSaque(contaPoupanca,70);

        if (contaPoupanca.calcularNovoSaldo(0.5)){
            System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
        }
    }

    private static void realizarSaque(ContaBancaria conta, double valor){
        if (conta.sacar(valor)){
            System.out.println("Saque efetuado com sucesso, novo saldo =" + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de" + valor + "saldo de = " + conta.getSaldo());
        }
    }
}
