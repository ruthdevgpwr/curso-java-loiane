package com.loiane.curso_java.aula52.labs;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) throws ContatoNaoExisteException {

        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = obterOpcaoMenu(scanner);

        if (opcao == 1) { //consultar contato
            String nomeContato = leInformacaoString(scanner, "Entre com o nome do contato a ser pesquisado: ");
            if (agenda.consultaContatoPorNome(nomeContato) >= 0) {
                System.out.println("Contato existe");
            }
        } else if (opcao == 2){ //adicionar contato

        } else if (opcao == 3) { //sair
            System.exit(0);
        }
    }

    public static String leInformacaoString(Scanner scanner, String msg){
        System.out.println(msg);
        String entrada = scanner.nextLine();
        return  entrada;
    }

    public static int obterOpcaoMenu(Scanner scanner){

        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida) {
            System.out.println("Digite a opção desejada: ");
            System.out.println("1: Consultar contato");
            System.out.println("2: Adicionar contato");
            System.out.println("3: Sair ");

            try {
                String entrada = scanner.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao == 1 || opcao == 2 || opcao == 3){
                    entradaValida = true;

                } else {
                    throw new Exception("Entrada inválida");
                }
            }
            catch (Exception e){
                System.out.println("Entrada inválida, digite novamente\n ");

            }
        }
        return opcao;
    }
}
