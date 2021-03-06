package ListaDuplamenteEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> listaDE = new ListaDuplamenteEncadeada<>();
        listaDE.adicionarIncio("A");
        listaDE.adicionarIncio("B");
        listaDE.adicionarIncio("C");
        listaDE.adicionar(1, "D");
        
        System.out.println(listaDE.buscar(0));
        System.out.println(listaDE.buscar(1));
        System.out.println(listaDE.buscar(2));
        System.out.println(listaDE.buscar(3));
        System.out.println(listaDE.tamanho());
        System.out.println(listaDE.primeiro());
        System.out.println(listaDE.ultimo());
        
      
    
    }
}
