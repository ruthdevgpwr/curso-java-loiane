package com.loiane.curso_java.aula52.labs;

public class Contato {

    private String nome;
    private String telefone;
    private String email;
    private int identificador;
    private static int contador = 0;

    public Contato(){
        contador++;
        identificador = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {
        return "Contato{ " +
                "nome=' " + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email=' " + email + '\'' +
                ", identificador= " + identificador +
                " }";
    }
}
