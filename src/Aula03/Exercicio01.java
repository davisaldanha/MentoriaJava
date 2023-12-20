package Aula03;

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        /*
            Elabore um programa que faça a leitura de vários números inteiros 
            até que se digite um número negativo. O programa tem de retornar o 
            maior e o menor número lido.
        */
        
        Scanner scan = new Scanner(System.in);
        int valor=0, maior=0, menor=0;
        
        for(;valor>=0;){
            if(valor==0){
                System.out.println("Digite um valor: ");
                valor = scan.nextInt();
                
                if(valor<0)
                    break;         
                
                maior=valor;
                menor=valor;
            }       
            System.out.println("Digite um valor: ");
            valor = scan.nextInt();
            
            if(valor>maior && valor>0)
                maior = valor;            
            if(valor<menor && valor>0)
                menor = valor;
        }
        
        System.out.printf("Maior: %d\nMenor: %d", maior, menor);
    }
}
