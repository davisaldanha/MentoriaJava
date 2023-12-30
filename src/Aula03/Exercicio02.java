package Aula03;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        /*
            Desenvolva um algoritmo capaz de cadastrar o nome dos convidados para
            uma festa de Natal. A quantidade deverá ser informada pelo usuário. 
            Possibilite a exibição dos nomes cadastrados.        
         */

        Scanner scan = new Scanner(System.in);
        int opcao, opMenu2, qtdConvidado;
        String[] bdConvidados = {""};

        do {
            System.out.println("**** Ceia de Natal ****");
            System.out.println("1- Cadastrar Convidados");
            System.out.println("2- Listar Convidados");
            System.out.println("3- Atualizar Lista");
            System.out.println("4- Sair");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Quantos convidados deseja cadastrar?");
                    qtdConvidado = scan.nextInt();

                    bdConvidados = new String[qtdConvidado];

                    for (int i = 0; i < bdConvidados.length; i++) {
                        System.out.printf("Nome do %dº Convidado: ", i + 1);
                        bdConvidados[i] = scan.next();
                    }
                    break;
                case 2:
                    if (bdConvidados[0].equals("")) {
                        System.out.println("Nenhum convidado cadastrado!");
                    } else {
                        System.out.println("**** Lista de Convidados ****");
                        for (String nome : bdConvidados) {
                            System.out.println(nome);
                        }
                    }
                    break;
                case 3:
                    do {
                        System.out.println("**** Ceia de Natal ****");
                        System.out.println("1- Editar Convidado");
                        System.out.println("2- Excluir Convidado");
                        System.out.println("3- Voltar ao menu principal");
                        opMenu2 = scan.nextInt();

                        switch (opMenu2) {
                            case 1:
                                System.out.println("**** Lista de Convidados ****");
                                for (int i=0; i< bdConvidados.length;i++) {
                                    System.out.printf("%d - %s", i, bdConvidados[i]);
                                }
                                System.out.println("Digite o id do convidado: ");
                                int id = scan.nextInt();
                                
                                System.out.println("Digite o nome do convidado:");
                                bdConvidados[id] = scan.next();
                                break;
                            case 2:
                                System.out.println("**** Lista de Convidados ****");
                                for (int i=0; i< bdConvidados.length;i++) {
                                    System.out.printf("%d - %s\n", i, bdConvidados[i]);
                                }
                                System.out.println("Digite o id do convidado: ");
                                id = scan.nextInt();
                                
                                bdConvidados[id] = " ";
                                break;
                            case 3:
                                System.out.println("Retornado ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção Inválida!");
                        }
                    } while (opMenu2 != 3);
                    break;
                case 4:
                    System.out.println("Ate logo!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcao != 4);
    }
}
