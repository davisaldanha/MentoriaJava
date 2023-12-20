package Aula02;

import java.util.Scanner;

public class Aula02 {
    
    public static void main(String[] args) {
        
        /*
            **** SWITCH - CASE ****
            
            É uma estrutura de decisão usada quando precisamos testar condições 
            para determinar qual setença de código ou bloco de código será executado
            em seguida.
        
            **** SINTAXE ****
        
            switch( expressão ){
                case valor1:
                    //setença ou bloco de código
                break;
                case valor2:
                    //setença ou bloco de código
                break;
                ...
                default:
                    //setença ou bloco de código
            }
        
        */
        
        //EXEMPLO
        
        Scanner scan = new Scanner(System.in);
        int mes;
        
        System.out.print("Digite uma valor de 1 à 12: ");
        mes = scan.nextInt();
        
        switch (mes) {
            case 1:
                System.out.println("JANEIRO!");
                break;
            case 2:
                System.out.println("FEVEREIRO!");
                break;
            case 3:
                System.out.println("MARÇO!");
                break;
            case 4:
                System.out.println("ABRIL!");
                break;
            case 5:
                System.out.println("MAIO!");
                break;
            case 6:
                System.out.println("JUNHO!");
                break;
            case 7:
                System.out.println("JULHO!");
                break;
            case 8:
                System.out.println("AGOSTO!");
                break;
            case 9:
                System.out.println("SETEMBRO!");
                break;
            case 10:
                System.out.println("OUTUBRO!");
                break;
            case 11:
                System.out.println("NOVEMBRO!");
                break;
            case 12:
                System.out.println("DEZEMBRO!");
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA!");
        }
        
        /*
            **** WHILE and DO-WHILE
        
            É uma estrutura utilizada para repetir uma parte do programa algumas 
            vezes, realizando assim uma iteração.
        
            **** SINTAXE ****
            
            while(condição) {
                //setença ou bloco de código que será executado
            }
        
            do{
                //setença ou bloco de código que será executado
            }while(condição);
        
            Na estrutura DO-WHILE temos a execução da setença ou bloco de código
            sendo realizada pelo menos uma vez.
        */
        
        //EXEMPLO
        
       int opcao;
      
        do{
            System.out.printf("**** MENU ****\n"
                    + "1- INICIAR JOGO\n"
                    + "2- CARREGAR JOGO\n"
                    + "3- OPÇÕES\n"
                    + "4- SAIR\n");

            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("JOGO INICIADO!");
                    break;
                case 2:
                    System.out.println("JOGO CARREGADO!");
                    break;
                case 3:
                    int valor;
                    do{
                        System.out.println("*** OPÇÕES ***\n"
                                + "1- CONFIGURAR VÍDEO\n"
                                + "2- CONFIGURAR AUDIO\n"
                                + "3- SAIR\n");
                        
                        System.out.print("Escolha uma opcao: ");
                        valor = scan.nextInt();
                    }while(valor!=3);  
                break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
            }    
        }while(opcao!=4);
    }
}
