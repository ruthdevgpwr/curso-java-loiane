package com.loiane.curso_java.aula26;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    double obterAutonomia() {

        System.out.println("Método obter autonomia foi chamado");
        return capCombustivel * consumoCombustivel;
    }
}
