package com.loiane.curso_java.aula36;

public class TesteContato {

    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Tyrion");
        //contato.setEndereco("Kings Landing");
        //contato.setTelefone("11 99999-9999");

        //criar objeto endereco
        //relacionamento tem um endereco
        Endereco end = new Endereco();
        end.setNomeRua("Rua Game of Thrones");
        end.setNomeRua("n/a");
        end.setComplemento("-");
        end.setCidade("King Landing");
        end.setEstado("Westeros");
        end.setCep("9999999");

       contato.setEndereco(end);

       //relacionamento tem um telefone

        Telefone telefone = new Telefone();
        telefone.setTipo("celular");
        telefone.setDdd("83");
        telefone.setNumero("98888-2120");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("casa");
        telefone2.setDdd("11");
        telefone2.setNumero("8888-9888");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

       //contato.setTelefone(telefone);
        contato.setTelefones(telefones);

        //Teste saida no console
        System.out.println(contato.getNome());
       // System.out.println(contato.getTelefone());

        if (contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        /*if (contato != null && contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        }*/

    }
}
