package Aula04;

import java.util.Scanner;

public class Aula04 {
    
    public static void main(String[] args) {
        
        /*
            **** MATRIZES ****
            
            Uma matriz é uma estrutura de dados que forma um array bidimensional.
            Diferentemente dos Vetores, as Matrizes nos possibilita trabalhar com
            linhas e colunas, muito semelhante à uma planilha Excel.
        
            Veja o exemplo abaixo:
             _ _ _ 
            |_|_|_|
            |_|_|_|   --> Temos uma matriz 3X3(3 linhas por 3 colunas)
            |_|_|_|
        
            Agora vamos usar a SINTAXE Java para declarar essa matriz.
        
            **** SINTAXE **** 
        
            <tipo> [][] matriz = new <tipo>[qtd_linhas][qtd_colunas];
        
            Iremos instanciar a matriz do tipo double e referenciá-la em uma 
            variável de nome notas. 
        */
        
        double [][] notas = new double[3][3];
        
        /*
            Para armazenar valores ou verificar elementos já armazenados dentro
            da matriz, precisamos utilizar os pares ordenados que identifica uma
            determinada posição na matriz.
            
            [linha, coluna] -> [0,0] [0,1] [0,2]
                               [1,0] [1,1] [1,2]
                               [2,0] [2,1] [2,2]
        
        */
        
        Scanner scan = new Scanner(System.in);
                 
//        //Inserção de valores na Matriz Notas
//        for(int linha=0;linha<notas.length;linha++){
//            System.out.printf("Cadastro de Notas do %dº Aluno\n", linha+1);
//            for(int coluna=0;coluna<notas[0].length;coluna++){
//                System.out.printf("%dº Nota: ", coluna+1);
//                notas[linha][coluna] = scan.nextDouble();
//            }
//        }
//        
//        //Visualização dos valores 
//        for(int linha=0;linha<notas.length;linha++){            
//            for(int coluna=0;coluna<notas[0].length;coluna++){
//                System.out.printf("%.2f\t", notas[linha][coluna]);
//            }
//            System.out.println("\n");
//        }
        
        String [] alunos = new String[3];
        double [] medias = new double[3];
        double soma=0;
        
        for(int i=0; i<alunos.length;i++){
            System.out.print("Nome do Aluno: ");
            alunos[i] = scan.next();
        }
        
        //Inserção de valores na Matriz Notas
        for(int linha=0;linha<notas.length;linha++){
            System.out.printf("Cadastro de Notas - %s\n", alunos[linha]);
            for(int coluna=0;coluna<notas[0].length;coluna++){
                System.out.printf("%dº Nota: ", coluna+1);
                notas[linha][coluna] = scan.nextDouble();
            }
        }
        
        //Visualização das Notas
        for(int linha=0;linha<notas.length;linha++){
            System.out.printf("%s: ", alunos[linha]);
            for(int coluna=0;coluna<notas[0].length;coluna++){
                System.out.printf("%.1f\t", notas[linha][coluna]); 
                soma += notas[linha][coluna];
            }
            medias[linha] = soma/3;
            System.out.printf("%.1f", medias[linha]);
            soma=0;
            System.out.println("");
        }
        
    }
}
