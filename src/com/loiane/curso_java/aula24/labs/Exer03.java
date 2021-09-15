package com.loiane.curso_java.aula24.labs;

public class Exer03 {

    public static void main(String[] args) {

        LivroLivraria livro = new LivroLivraria();
        livro.nome = "O mundo de Sophia";
        livro.autor = "Joisten Gardeen";
        livro.numeroPaginas = 568;
        livro.idioma = "Português";
        livro.preco = 31.90;

        System.out.println("Nome do livro: " + livro.nome);
    }
}
