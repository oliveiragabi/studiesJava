package lista;

public class Lista {
    
    public static void main(String[] args) {
        /*
        ListaEncadeada<String> lista1 = new ListaEncadeada<>();
        lista1.adicionarInicio("A");
        lista1.adicionarInicio("B");
        lista1.adicionarInicio("C");
        lista1.adicionarFim("X");
        */
        //System.out.println(lista.buscar(3));
        
        
        ListaCircular<String> lista2 = new ListaCircular<>();
        lista2.adicionarInicio("A");
        lista2.adicionarInicio("B");
        lista2.adicionarInicio("C");
        lista2.adicionarFim("X");
        lista2.removerInicio();
        System.out.println(lista2.buscar(2));
        System.out.println(lista2.tamanho());      
        
        
        ListaDuplaEncadeada<String> lista3 = new ListaDuplaEncadeada<>();
        lista3.adicionarInicio("A");
        lista3.adicionarInicio("B");
        lista3.adicionarInicio("C");
        lista3.adicionarFim("X");
        lista3.adicionar(3, "D");
        System.out.println(lista3.buscar(3) + " " + lista3.buscar(2));
        System.out.println(lista3.tamanho());
    }
    
}
