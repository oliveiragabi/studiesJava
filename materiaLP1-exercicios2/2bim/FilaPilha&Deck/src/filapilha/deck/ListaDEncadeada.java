package filapilha.deck;

public class ListaDEncadeada<T> implements ListaDEncadeadaI<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanho = 0;

    public ListaDEncadeada() {
        cabeca = new No<T>(null, null, null);
        cauda = new No<T>(cabeca, null, null);
        cabeca.setProximo(cauda);
        tamanho = 0;
    }

    private void adicionarEntre(T elemento, No<T> anterior, No<T> proximo) {
        No<T> no = new No<T>(anterior, elemento, proximo);
        anterior.setProximo(no);
        proximo.setAnterior(no);
        tamanho++;

    }

    private void remover(No<T> no) {
        no.getProximo().setAnterior(no.getAnterior());
        no.getAnterior().setProximo(no.getProximo());
        tamanho--;
    }

    public void adicionarInicio(T elemento) {
        adicionarEntre(elemento, cabeca, cabeca.getProximo());
    }

    public void adicionarFim(T elemento) {
        adicionarEntre(elemento, cauda.getAnterior(), cauda);
    }

    public void removerInicio() {
        if (vazia()) {
            throw new RuntimeException("Lista Vazia");
        }
        remover(cabeca.getProximo());
    }

    public void removerFim() {
        if (vazia()) {
            throw new RuntimeException("Lista Vazia");
        }
        remover(cauda.getAnterior());
    }

    public T primeiro() {
        return cabeca.getProximo().getElemento();
    }

    public T ultimo() {
        return cauda.getAnterior().getElemento();
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean vazia() {
        if (tamanho == 0) {
            return true;
        } else {
            return false;
        }
    }

    public T buscar(int posicao) {
        return buscarNo(posicao).getElemento();
    }

    private No<T> buscarNo(int posicao) {
        No<T> encontrado = cabeca;
        for (int i = 0; i < posicao; i++) {
            encontrado = encontrado.getProximo();
        }
        return encontrado;

    }

    @Override
    public void adicinar(int posicao, T elemento) {
        No<T> aux = cabeca.getProximo();
        for (int i = 0; i < posicao; i++) {
            aux = aux.getProximo();
        }
        adicionarEntre(elemento, aux.getAnterior(), aux);

    }
}
