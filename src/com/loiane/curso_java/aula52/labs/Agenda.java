package com.loiane.curso_java.aula52.labs;


public class Agenda {

    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }

    private void adicionarContato(Contato c) throws AgendaCheiaException {

        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++){
            if (contatos[i] != null){
                contatos[i] = c;
                cheia = false;
            }
        }
        if (cheia){
            throw  new AgendaCheiaException();
            //lançar exception aqui
        }
    }

    public int consultaContatoPorNome(String nome) throws ContatoNaoExisteException {
        for (int i = 0; i<contatos.length; i++){
            if (contatos[i] != null){
                if (contatos[i].getNome().equalsIgnoreCase(nome)){
                    return i;
                }
            }
        }
        throw new ContatoNaoExisteException(nome);
    }


    @Override
    public String toString() {
        String s = "";
        for (Contato c : contatos){
            s += c.toString() + "\n";
        }
        return s;
    }
}
