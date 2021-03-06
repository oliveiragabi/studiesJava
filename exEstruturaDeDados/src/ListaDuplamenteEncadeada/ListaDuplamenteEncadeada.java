package ListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> implements ListaDuplamenteEncadeadaInterface<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanho;

    public ListaDuplamenteEncadeada() {
        cabeca= new No<>(null, null, null);
        cauda= new No<>(cabeca, null, null);
        cabeca.setProximo(cauda);
    }
    
    @Override
    public void adicionarIncio(T elemento) {
        adicionarEntre(elemento, cabeca, cabeca.getProximo());
    }

    @Override
    public void adicionarFim(T elemento) {
        adicionarEntre(elemento, cabeca.getAnterior(), cabeca);
    }

    @Override
    public void removerIncio() {
        if(vazia()) throw new RuntimeException("Lista Vazia");
        remover(cabeca.getProximo());
    }

    @Override
    public void removerFim() {
        if(vazia()) throw new RuntimeException("Lista Vazia");
        remover(cauda.getAnterior());
    }

    @Override
    public T primeiro() {
        return cabeca.getProximo().getElemento();
    }

    @Override
    public T ultimo() {
        return cauda.getAnterior().getElemento();
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public boolean vazia() {
        if(tamanho == 0){
            return true;
        }else 
            return false;
    }

    @Override
    public void adicionar(int posicao, T elemento) {
        No<T> aux = cabeca.getProximo();
        for(int i=0; i<posicao; i++){
            aux = aux.getProximo();
        }
        adicionarEntre(elemento, aux.getAnterior(), aux);
    }

    @Override
    public T buscar(int posicao) {
        No<T> aux = cabeca.getProximo();
        for(int i=0; i<posicao; i++){
            aux = aux.getProximo();
        }
        return aux.getElemento();
    }
    
    private void adicionarEntre(T elemento, No<T> anterior, No<T> proximo){
        No<T> no= new No<>(anterior, elemento, proximo);
        anterior.setProximo(no);
        proximo.setAnterior(no);
        tamanho++;
    }
    
    private void remover(No<T> no){
        No<T> anterior = no.getAnterior();
        No<T> proximo = no.getProximo();
        anterior.setProximo(proximo);
        proximo.setAnterior(anterior);
        tamanho--;
    }
}
