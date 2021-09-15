package com.loiane.curso_java.aula31;

public class Carro {

    public String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    private double consumoCombustivel;

    public double obterAutonomia() {

        System.out.println("Método obter autonomia foi chamado");

        return this.capCombustivel * this.consumoCombustivel;
    }

    private double divideKMPorConsumoCombustivel(double km) {
        return km/this.consumoCombustivel;
    }
    public double calcularCombustivel(double km) {

        return this.divideKMPorConsumoCombustivel(km);
    }
}
