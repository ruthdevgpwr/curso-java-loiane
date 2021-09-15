package com.loiane.curso_java.aula24.labs;

public class Exer06 {

    public static void main(String[] args) {

        ContatoAgenda contato1 = new ContatoAgenda();
        contato1.nome = "Emerson";
        contato1.email = "emersondasb@gmail.com";
        contato1.endereco = "Rua Poeta Luiz, Residencial Columbia";

        contato1.telefones = new String[5];
        contato1.telefones[0] = "99999-9999";
        contato1.telefones[1] = "98888-8888";
        contato1.telefones[2] = "98777-2121";

        System.out.println(contato1.telefones[0]);
    }
}
