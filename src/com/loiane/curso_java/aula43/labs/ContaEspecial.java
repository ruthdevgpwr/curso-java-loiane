package com.loiane.curso_java.aula43.labs;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaEspecial { " +
                "limite = " + limite +
                '}';
    }

    public boolean sacar(double valor){
        double saldoComLimite = this.getSaldo() + this.getLimite();

        if ((saldoComLimite - valor) >= 0){
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }
}
