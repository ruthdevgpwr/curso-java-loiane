package com.loiane.curso_java.aula45;

public class Teste {

    public static void main(String[] args) {
         /*Aluno aluno = new Aluno();
    Pessoa pessoaAlunno = aluno; //upcasting

    Pessoa aluno2 = (Pessoa) new Aluno();*/

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        if (pessoa instanceof Pessoa){
            System.out.println("É do tipo Pessoa");

        }if (aluno instanceof Aluno){
            System.out.println("É do tipo Aluno");

        }if (professor instanceof Professor){
            System.out.println("É do tipo Professor");
        }
    }

}
