package ex1estruduradados;
import  ex1estruduradados.Vetor;

public class Main {

    public static void main(String[] args) {
        Vetor vetor = new Vetor (10);
        
        vetor.adicionar("elemento 1");
        vetor.adicionar("elemento 2");
        vetor.adicionar("elemento 3");
        vetor.adicionar("elemento 4");
        vetor.adicionar("elemento 5");
        vetor.adicionar("elemento 6");
        vetor.adicionar("elemento 7");
        vetor.adicionar("elemento 8");
        vetor.adicionar("elemento 9");
        vetor.adicionar("3, elemento 10");
      
        vetor.aumentarCapacidade();
       
        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());
        System.out.println(vetor.buscas("elemento 5"));
        System.out.println(vetor.buscas("elemento 6"));
        System.out.println(vetor.buscas("Elemento 11"));
        System.out.println(vetor.buscas("ELemento 1"));
        System.out.println(vetor.buscas("Elementu 4"));
        System.out.println(vetor.buscas("elemento 4"));
    }
    
}
