package AulaBonus;

import java.util.ArrayList;

public class ExampleArrayList {
    
    public static void main(String[] args) {
        
        ArrayList<String> alunos = new ArrayList<String>();
        
        //Métodos
        //Adicionar itens
        alunos.add("Davi");
        alunos.add("Joao");
        alunos.add("Ana");
        
        //Acessar item
        alunos.get(0);
        System.out.println(alunos.get(0));
        
        //Alterar item
        alunos.set(0, "Daniel");
        System.out.println(alunos.get(0));
        
        //Remover item
        alunos.remove(0);
        System.out.println(alunos.get(0));
        
        //Remover todos os itens
        System.out.println(alunos.size());
        alunos.clear();
        
        //Obter Tamanho da lista
        alunos.size();
        System.out.println(alunos.size());
        
        
    }
    
}
