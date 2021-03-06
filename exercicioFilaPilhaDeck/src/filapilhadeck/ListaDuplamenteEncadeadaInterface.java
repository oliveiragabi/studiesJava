package listaduplamenteencadeada;


public interface ListaDuplamenteEncadeadaInterface<t> {
    public void adicionarInicio(t elemento);
    public void adicionarFim(t elemento);
    public void removerInicio();
    public void removerFim();
    public t primeiro();
    public t ultimo();
    public int tamanho();
    public boolean vazia();
    public void adicionar(int posicao, t elemento);
    public t buscar(int posicao);
    
}
