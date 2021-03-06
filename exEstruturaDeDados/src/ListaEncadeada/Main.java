package ListaEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> numero = new ListaEncadeada<>();
        numero.adicionarIncio("OI");
        numero.adicionarFim("TUDO");
        numero.adicionarFim("BOM");
        numero.adicionarFim("?");
        numero.adicionar(1, "22");
        
        System.out.println(numero.buscar(0));
        System.out.println(numero.buscar(1));
        System.out.println(numero.buscar(2));
        System.out.println(numero.buscar(3));
        System.out.println(numero.buscar(4));
    }
}
