package com.loiane.curso_java.aula27.labs;

public class Exer03 {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ruth";
        aluno1.curso = "Sistemas para Internet";
        aluno1.disciplina1 = "Orientação a Objetos";
        aluno1.disciplina2 = "Estrutura de Dados";
        aluno1.disciplina3 = "Sistemas Operacionais";
        aluno1.notaDisciplina1 = 5;
        aluno1.notaDisciplina2 = 4;
        aluno1.notaDisciplina3 = 3;

        aluno1.mostrarNotaDisciplina1();

        System.out.println("Está aprovado na disciplina 1? " + aluno1.estaAprovadoEmDisciplina1());
        System.out.println("Está aprovado no curso? " + aluno1.estaAprovadoNoCurso());

    }
}
