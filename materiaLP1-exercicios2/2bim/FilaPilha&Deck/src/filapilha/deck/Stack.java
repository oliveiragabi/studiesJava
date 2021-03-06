package filapilha.deck;

import filapilha.deck.ListaDEncadeada;

public class Stack<T> implements StackI<T> {

    ListaDEncadeada<T> listaDE;

    public Stack() {
        listaDE = new ListaDEncadeada<>();
    }

    public void push(T element) {
        listaDE.adicionarInicio(element);
    }

    @Override
    public T pop() {
        T elemento = listaDE.primeiro();
        listaDE.removerInicio();
        return elemento;
    }

    @Override
    public T top() {
        return listaDE.primeiro();
    }

    @Override
    public int size() {
        return listaDE.tamanho();
    }

    @Override
    public boolean isEmpty() {
        return listaDE.vazia();
    }

}
