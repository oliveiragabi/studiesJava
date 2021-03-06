package listaVetor;

public class Main {

    public static void main(String[] args) {
        Vetor vetor = new Vetor (10);
        
        vetor.adicionar("\nelemento 1");
        vetor.adicionar("elemento 2");
        vetor.adicionar("elemento 3");
        vetor.adicionar("elemento 4");
        vetor.adicionar("elemento 5");
        vetor.adicionar("elemento 6");
        vetor.adicionar("elemento 7");
        vetor.adicionar("elemento 8");
        vetor.adicionar("elemento 9");
        vetor.adicionar("3,elemento  10 \n\n");
        
        
     
       
        System.out.println(vetor.tamanho());
        ///////////////////////////////////////
        System.out.println(vetor.toString());
        System.out.println(vetor.buscas("\nelemento 11"));
        System.out.println(vetor.buscas("ELemento 1"));
        System.out.println(vetor.buscas("Elementu 4"));
      
        
        
        
     
    }
    
}
