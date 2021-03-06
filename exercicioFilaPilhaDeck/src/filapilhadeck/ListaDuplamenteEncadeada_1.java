package listaduplamenteencadeada;


public class ListaDuplamenteEncadeada<t> implements ListaDuplamenteEncadeadaInterface<t> {
    private No<t> cabeca;
    private No<t> cauda;
    private int tamanho = 0;
    
    public ListaDuplamenteEncadeada(){
        cabeca = new No<t>(null, null, null);
        cauda = new No<t>(cabeca, null, null);
        cabeca.setProximo(cauda);
        tamanho = 0;
    }
       
    
    private void adicionarEntre(t elemento, No<t> anterior,  No<t> proximo){
        No<t> no = new No<t>(anterior, elemento, proximo);
        anterior.setProximo(no);
        proximo.setAnterior(no);
        tamanho ++;
        
    }
    
    private void remover(No<t> no){
        no.getProximo().setAnterior(no.getAnterior());
        no.getAnterior().setProximo(no.getProximo());
        tamanho --;
    }
    
    @Override
    public void adicionarInicio(t elemento) {
        adicionarEntre(elemento, cabeca, cabeca.getProximo());
    }

    @Override
    public void adicionarFim(t elemento) {
        adicionarEntre(elemento, cauda.getAnterior(), cauda);
    }

    @Override
    public void removerInicio() {
        if(vazia())
            throw new RuntimeException("Lista Vazia");
        remover(cabeca.getProximo());
    }

    @Override
    public void removerFim() {
        if(vazia())
            throw new RuntimeException("Lista Vazia");
        remover(cauda.getAnterior());
    }

    @Override
    public t primeiro() {
        return cabeca.getProximo().getElemento();
    }

    @Override
    public t ultimo() {
        return cauda.getAnterior().getElemento();
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public boolean vazia() {
        if(tamanho == 0)
            return true;
        
        else
            return false;
    }

    @Override
    public void adicionar(int posicao, t elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public t buscar(int posicao) {
        No<t> noPosicao = cabeca;
        for(int i = 0; i< posicao; i++){
            noPosicao = noPosicao.getProximo();
        }    
        return noPosicao.getElemento();
    }

    
   
    
    
}
