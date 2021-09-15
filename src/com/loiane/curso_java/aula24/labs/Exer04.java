package com.loiane.curso_java.aula24.labs;

import java.util.Date;

public class Exer04 {

    public static void main(String[] args) {

        LivroDeBiblioteca livro = new LivroDeBiblioteca();
        livro.nome = "O mundo de Sophia";
        livro.autor = "Joisten Gardeen";
        livro.numeroPaginas = 568;
        livro.idioma = "Português";
        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoA = "Emerson";

        System.out.println(livro.emprestadoA);
    }
}
