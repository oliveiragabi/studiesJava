package ListaEncadeada;

import Stack.StackInterface;

public class Stack<T> implements StackInterface<T>{

    ListaEncadeada<T> listaE;

    public Stack() {
        listaE = new ListaEncadeada<>();
    }
    
    @Override
    public void push(T element) {
        listaE.adicionarIncio(element);
    }

    @Override
    public T pop() {
        T elemento = listaE .primeiro();
        listaE.removerInicio();
        return elemento;
    }

    @Override
    public T top() {
        return listaE.primeiro();
    }

    @Override
    public int size() {
        return listaE.tamanho();
    }

    @Override
    public boolean isEmpty() {
        return listaE.vazia();
    }
    
}
