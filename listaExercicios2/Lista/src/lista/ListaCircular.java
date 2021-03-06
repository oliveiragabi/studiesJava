package lista;

public class ListaCircular<T> implements ListaInterface<T>{
    
    private No<T> cauda;
    private int tamanho;

    public ListaCircular() {
        cauda = null;
        tamanho = 0;
    }
    
    @Override
    public void adicionarInicio(T elemento) {
        if(vazia()) {
            cauda = new No<T>(elemento, null);
            cauda.setProximo(cauda);
        } else {
            No<T> no = new No<>(elemento, cauda.getProximo());
            cauda.setProximo(no);
        }
        tamanho++;
    }

    @Override
    public void adicionarFim(T elemento) {
        adicionarInicio(elemento);
        cauda = cauda.getProximo();
    }
    
    @Override
    public void removerInicio() {
        if(vazia()) throw new RuntimeException("Lista Vazia");
        No<T> cabeca = cauda.getProximo();
        cauda = cabeca.getProximo();
        tamanho--;
        if(vazia()) cauda = null;
    }

    @Override
    public void removerFim() {
        if(vazia()) throw new RuntimeException("Lista Vazia");
        No<T> ant = cauda.getProximo();
        for(int i = 1; i< tamanho-1; i++){
            ant = ant.getProximo();
        }
        ant.setProximo(null);
        cauda = ant;
        tamanho--;
        if(vazia()) {
            cauda = null;
        }
    }

    @Override
    public T primeiro() {
        return cauda.getProximo().getElemento();
    }

    @Override
    public T ultimo() {
        return cauda.getElemento();
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public boolean vazia() {
        return tamanho == 0;
    }

    @Override
    public T buscar(int posicao) {
        if(vazia()) throw new RuntimeException("Lista Vazia");
        if(posicao < 0 || posicao > tamanho) throw new RuntimeException("Posição inválida");
        else{
        No<T> ant = cauda.getProximo();
        for(int i = 0; i< posicao; i++){
            ant = ant.getProximo();
        }        
        return ant.getElemento();
        }
    }

    @Override
    public void adicionar(int posicao, T elemento) {
        if(posicao < 0 || posicao > tamanho) throw new RuntimeException("Posição inválida");
        if (posicao == 0){
            adicionarInicio(elemento);
        }
        if (posicao == tamanho){
            adicionarFim(elemento);
        }
        No<T> ant = cauda.getProximo();
        for(int i = 1; i< posicao; i++){
            ant = ant.getProximo();
        }  
        No<T> no = new No<T>(elemento, ant.getProximo());
        ant.setProximo(no);
        tamanho++;
    }
    
}
