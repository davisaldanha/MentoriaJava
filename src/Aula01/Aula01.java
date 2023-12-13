package Aula01;

public class Aula01 {

    public static void main(String[] args) {
        
       /*Tipos Primitivos
            - byte
            - short
            - char
            - int
            - long
            - float
            - double        
        */
       
       /*
        Java Casting - a possibilidade de converter tipos de dados
       
        **Casting Automático**
            byte -> short -> char -> int -> long -> float -> double
       */
       int x = 10;
       double y = x;
       
       System.out.println(y);
       
       /*
        **Casting Manual**
            double -> float -> long -> int -> char -> short -> byte
       */
       double a = 10.55;
       long b = (long) a;
       
        System.out.println(b);
        
     /*
        **Operadores Aritméticos**
            soma -> +
            subtração -> -
            multiplicação -> *
            divisão -> /
            resto da divisão -> %
        
        **Operadores Relacionais**
            igual -> ==
            menor -> <
            maior -> <
            maior igual -> >=
            menor igual -> <=
            diferente -> !=
        
        **Operadores Lógicos**
            AND -> &&
            OR -> ||
            NOT -> ! 
        */ 
     
     /*
     
        Estrutura Condicional Simples -> IF
        Estrutura Condicional Composta -> IF..ELSE
        Estrutura Condicional Encadeada -> IF..ELSE..IF
     
     */
     
     double media = 5.0, frequencia = 80.0;
     
     
     //ESTRUTURA CONDICIONAL SIMPLES
     if(media>=7)
        System.out.println("APROVADO!");
    
    //ESTRUTURA CONDICIONAL COMPOSTA
     if(media>=7)
        System.out.println("APROVADO!");
     else
        System.out.println("REPROVADO!");
    
    //ESTRUTURA CONDICIONAL ENCADEADA
    if(media>=7 && frequencia>=75){
        System.out.println("APROVADO!");
        if(media>=9){
            System.out.println("ALUNO DESTAQUE!");
        }
    }else{
        if(media>=7 && frequencia>=60){
           System.out.println("CONSELHO DE CLASSE!"); 
        }else{
            System.out.println("REPROVADO!");
        }
    }  
   
    }
    
}
