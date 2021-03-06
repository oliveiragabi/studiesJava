package filapilha.deck;

public class Deck<T> implements DeckInterface<T> {

    ListaDEncadeada<T> listaDE;

    public Deck() {
        listaDE = new ListaDEncadeada<>();
    }

    @Override
    public void adicionarFim(T elemento) {
        listaDE.adicionarFim(elemento);
    }

    @Override
    public void removerInicio() {
        listaDE.removerInicio();
    }

    @Override
    public void removerFim() {
        listaDE.removerFim();
    }

    @Override
    public T primeiro() {
        return listaDE.primeiro();
    }

    @Override
    public T ultimo() {
        return listaDE.ultimo();
    }

    @Override
    public int tamanho() {
        return listaDE.tamanho();
    }

    @Override
    public boolean vazia() {
        return listaDE.vazia();
    }

    public void adicionarInicio(T elemento) {
        listaDE.adicionarInicio(elemento);
    }

}
