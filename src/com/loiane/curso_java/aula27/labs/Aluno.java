package com.loiane.curso_java.aula27.labs;

public class Aluno {

    String nome;
    int matricula;
    String curso;
    String disciplina1;
    String disciplina2;
    String disciplina3;
    double notaDisciplina1;
    double notaDisciplina2;
    double notaDisciplina3;

    boolean estaAprovadoEmDisciplina1() {
        return notaDisciplina1 >= 7;
    }

    boolean estaAprovadoEmDisciplina2() {
        return notaDisciplina2 >= 7;
    }

    boolean estaAprovadoEmDisciplina3() {
        return notaDisciplina3 >=7;
    }

    boolean estaAprovadoNoCurso() {
        return (notaDisciplina1 + notaDisciplina2 + notaDisciplina3) / 3 >= 7;
    }

    void mostrarNotaDisciplina1() {
        System.out.println(notaDisciplina1);
    }

    void mostrarNotaDisciplina2() {
        System.out.println(notaDisciplina2);
    }

    void mostrarNotaDisciplina3() {
        System.out.println(notaDisciplina3);
    }

}
