package ListaEncadeada;

public class ListaEncadeada<T> implements ListaEncadeadaInterface<T>{

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanho;

    public ListaEncadeada() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanho = 0;
    }
    
    @Override
    public void adicionarIncio(T elemento) {
        No<T> no = new No<T>(elemento, cabeca);
        cabeca = no;
        if(vazia()) cauda=cabeca;
        tamanho++;
    }

    @Override
    public void adicionarFim(T elemento) {
        No<T> no = new No<T>(elemento, null);
        if(vazia())
            cabeca=no;
        else
            cauda.setProximo(no);
        cauda=no;
        tamanho++;
    }

    @Override
    public void removerInicio() {
        if(vazia()) throw new RuntimeException("Lista Vazia");
        cabeca = cabeca.getProximo();
        tamanho--;
        if(vazia()) cauda=null;
    }

    @Override
    public void removerFim() {
        if(vazia()) throw new RuntimeException("Lista Vazia");
        No<T> ant=cabeca;
        for(int i=1; i<tamanho-1; i++){
            ant= ant.getProximo();
        }
        ant.setProximo(null);
        cauda=ant;
        tamanho--;
        if(vazia()){
            cabeca=null;
            cauda=null;
        }
    }

    @Override
    public T primeiro() {
        return cabeca.getElemento();
    }

    @Override
    public T ultimo() {
        if(vazia()) throw new RuntimeException("Lista Vazia");
        return cauda.getElemento();
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public boolean vazia() {
        return tamanho==0;
    }

    @Override
    public T buscar(int posicao) {
        No<T> pos= cabeca;
        if(vazia()) throw new RuntimeException("Lista Vazia");
        for(int i=0; i<posicao; i++){
            pos = pos.getProximo();
        }
        return pos.getElemento();
    }

    @Override
    public void adicionar(int posicao, T elemento) {
        No<T> aux= cabeca;
        for(int i=0; i<posicao-1; i++){
            aux = aux.getProximo();
        }
        
        No<T> no = new No(elemento, null);
        no.setProximo(aux.getProximo());
        aux.setProximo(no);
    }    
}
