package ListaCircular;

public class ListaCircular <T> implements ListaCircularInterface<T> {
    private No<T> cauda;
    private int tamanho;
    
    public ListaCircular(){
        cauda=null;
        tamanho=0;
    }

    @Override
    public void adicionarInicio(T elemento) {
        if(vazia()){
            cauda = new No(elemento, null);
            cauda.setProximo(cauda);
        }else{
            No<T> no= new No(elemento, cauda.getProximo());
            cauda.setProximo(no);
        }
        tamanho++;
    }

    @Override
    public void adicionarFim(T elemento) {
        adicionarInicio(elemento);
        cauda = cauda.getProximo();
         tamanho++;
    }

    @Override
    public void removerInicio() {
        if(vazia()) throw new RuntimeException("Lista Vazia");
        cauda.setProximo(cauda.getProximo().getProximo());
    }

    @Override
    public void removerFim() {
        if(vazia())throw new RuntimeException("Lista Vazia");
        No<T> aux = cauda.getProximo();
        for(int i=1; i<tamanho-1; i++){
            aux = aux.getProximo();
        }
        aux.setProximo(cauda.getProximo());        
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
        if(tamanho == 0){
            return true;
        }else 
            return false;
    }

    @Override
    public void adicionar(int posicao, T elemento) {
        No<T> auxiliar = cauda.getProximo();
        for(int i=0; i<posicao-1; i++){
            auxiliar= auxiliar.getProximo();
        }
        No<T> no = new No(elemento, null);
        no.setProximo(auxiliar.getProximo());
        auxiliar.setProximo(no);
    }

    @Override
    public T buscar(int posicao) {
        No<T> aux = cauda.getProximo();
        for(int i=0; i<posicao; i++){
            aux= aux.getProximo();
        }
        return aux.getElemento();
    }
    
}
