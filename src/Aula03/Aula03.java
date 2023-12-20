package Aula03;

import java.util.Scanner;

public class Aula03 {
    
    public static void main(String[] args) {
        /*
            **** FOR ****
        
            A estrutura de repetição FOR possui a mesma posição teórica do comando
            WHILE, porém com uma sintaxe diferente. Vejamos...
        
            **** SINTAXE ****
            
            for (inicialização; teste; incremento){
                //setença ou bloco de código
            }        
        */
        
        //EXEMPLO 01 
        /*
            Imprimir sequência de números do 1 até 10
        */
        
        for(int i=1;i<=10;i++){
            System.out.printf("%d\n", i);
        }
        
        
        /*
            **** OBSERVAÇÕES ****
        
            1 -> Qualquer uma das três partes do for pode ser omitida.
            2 -> Todavia, o ponto-e-vírgula deve estar presente.
            3 -> Se todas as expressões de inicialização e de incremento forem 
            omitidas, elas apenas serão desconsideradas.
            4 -> Porém, se a expressão de teste for omitida, a mesma é considerada 
            permanentemente verdadeira.
        
        
            **** FOR-EACH ****
        
            Em Java o FOR-EACH é usado para iterações de listas e coleções. Possuindo
            a mesma ideia do FOR porém de forma simplificada, deixando o código leve
            e fácil de ser lido pelos desenvolvedores.
        
            **** SINTAXE ****
            
            for(<Tipo> <identificação> : <array ou colletion>){
                //lista de comandos
            }
 
        */
        
        //EXEMPLO
        
        int[] meuArray = new int[3];
        
        meuArray[0] = 1;
        meuArray[1] = 2;
        meuArray[2] = 3;
        
        for(int i=0;i<meuArray.length; i++){
            System.out.println(meuArray[i]);
        }
        
        System.out.println("");
        
        for(int i : meuArray){
            System.out.println(i);
        }
        
        
        /*
            **** VETORES ****
        
            Pense em uma caixa onde será possível armazenar dentro dela vários 
            elementos. Iremos nomear a caixa e teremos a possibilidade de alterar 
            os seus elementos. Nossa caixa deverá ter um tipo correspondente aos
            elementos que estarão armazenados dentro dela.
        
            Observação: Em Java, arrays são objetos que armazenam múltiplas variáveis 
                       do mesmo tipo.
        
            **** SINTAXE ****
        
            <Tipo> [] nomeVetor = new <Tipo>[tamanho];
        */
        
        //Exemplo 
        
        Scanner scan = new Scanner(System.in);
        String [] meses = new String[12];
        
        for(int i=0; i<meses.length;i++){
            System.out.printf("Digite o %dº mês do ano", i+1);
            meses[i] = scan.next();
        }
        
        for(String mes : meses){
            System.out.println(mes);
        }
    }
    
}
