package filapilha.deck;

public class Main {

    public static void main(String[] args) {
        Stack s1 = new Stack();

        s1.push("3");
        s1.push("2");
        s1.push("1");

        System.out.println("------------- PILHA ------------\nempilhando: " + s1.top());
        System.out.println("desempilhando: " + s1.pop());
        System.out.println("tamanho: " + s1.size());
////////////////////////////////////////////////////////////////////

        Fila<String> f1 = new Fila<>(20);
        f1.enfileirar("3");
        f1.enfileirar("4");
        f1.enfileirar("5");

        f1.desenfileirar();

        System.out.println("\n ------------- FILA ------------\n" + f1.tamanho());
        System.out.println(f1.primeiro());

        //   System.out.println(f1.toString());
///////////////////////////////////////////////////////////////////////
        Deck deck = new Deck();

        deck.adicionarInicio(1);
        deck.adicionarInicio(2);
        deck.adicionarInicio(3);

        deck.adicionarFim(5);
        deck.removerInicio();

        System.out.println("\n ------------- DECK ------------\n" + deck.primeiro());
        System.out.println(deck.ultimo());
        System.out.println(deck.tamanho());

    }

}
