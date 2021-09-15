package com.loiane.curso_java.aula24.labs;

public class Exer02 {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.nome = "Harry Potter e a Pedra Filosofal";
        livro.autor = "J.K Rowling";
        livro.numeroPaginas = 300;
        livro.idioma = "Português";

        System.out.println("Nome do livro: " + livro.nome);
    }
}
