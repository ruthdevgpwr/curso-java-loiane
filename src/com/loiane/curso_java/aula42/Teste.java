package com.loiane.curso_java.aula42;

public class Teste {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        //Pessoa aluno = new Aluno();
        //Pessoa professor = new Professor();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        //exemplo02
        System.out.println(Constantes.URL_BLOG);
        //Constantes.URL_BLOG = "huiushuihsiuhsuih";
        System.out.println(Constantes.URL_BLOG);

        final int TOTAL = 1;
        //total = total + 1;
        System.out.println(TOTAL);
    }
}
