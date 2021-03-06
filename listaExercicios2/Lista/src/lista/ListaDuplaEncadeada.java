package lista;

public class ListaDuplaEncadeada<T> implements ListaInterface<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanho;

    public ListaDuplaEncadeada() {
        cabeca = new No<> (null, null, null);
        cauda = new No<> (cabeca, null, null);
        cabeca.setProximo(cauda);
        tamanho = 0;
    }
    
    private void adicionarEntre(T elemento, No<T> anterior, No<T> proximo) {
        No<T> no = new No<>(anterior, elemento, proximo);
        anterior.setProximo(no);
        proximo.setAnterior(no);
        tamanho ++;
    }

    @Override
    public void adicionarInicio(T elemento) {
        adicionarEntre(elemento, cabeca, cabeca.getProximo());
    }

    @Override
    public void adicionarFim(T elemento) {
        adicionarEntre(elemento, cauda.getAnterior(), cauda);
    }

    private void remover(No<T> no) {
        No<T> anterior = no.getAnterior();
        No<T> proximo = no.getProximo();
        anterior.setProximo(proximo);
        proximo.setAnterior(anterior);
        tamanho--;
    }
    
    @Override
    public void removerInicio() {
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
        return tamanho == 0;
    }

    @Override
    public T buscar(int posicao) {
        if(vazia()) throw new RuntimeException("Lista Vazia");
        if(posicao < 0 || posicao > tamanho) throw new RuntimeException("Posição inválida");
        else{
        No<T> ant = cabeca;
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
        No<T> ant = cabeca;
        for(int i = 1; i< posicao; i++){
            ant = ant.getProximo();
        }  
        No<T> no = new No<T>(elemento, ant.getProximo());
        ant.setProximo(no);
        tamanho++;
    }
    
    
}
