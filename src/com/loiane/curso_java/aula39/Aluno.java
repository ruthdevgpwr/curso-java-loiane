package com.loiane.curso_java.aula39;

public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;

    public void verificarAcesso() {
        this.nomeVisibilidade = "Maria";
        super.nomeVisibilidade = "Maria";
        this.setNomeVisibilidade("Maria"); //tbm poderia ser super.Nomevisibilidade.
    }

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso, double[] notas) {
        super(nome, endereco, telefone);
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public void metodoQualquer(){
        super.setCpf("45454545454545");
        this.setCpf("484474747474747");
    }
}
