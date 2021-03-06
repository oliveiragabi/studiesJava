package ListaCircular;

public class Main {
    public static void main(String[] args) {
        ListaCircular listaC = new ListaCircular();
        listaC.adicionarInicio("A");
        listaC.adicionarInicio("B");
        listaC.adicionarInicio("C");
        
        listaC.adicionarFim("D");
        listaC.adicionarFim("E");
        listaC.adicionarFim("F");
        
        listaC.adicionar(2, "OI");
        
        System.out.println(listaC.buscar(0));
        System.out.println(listaC.buscar(1));
        System.out.println(listaC.buscar(2));
        System.out.println(listaC.buscar(3));
        System.out.println(listaC.buscar(4));
        System.out.println(listaC.buscar(5));
        System.out.println(listaC.buscar(6));
       
    }
}
