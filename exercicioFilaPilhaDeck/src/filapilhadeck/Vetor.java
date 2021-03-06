package estruturadedadados;

public class Vetor implements VetorInterface{
    private String[] elementos;
    int tamanho = 0;

   
    
    public Vetor(int capacidade){
        elementos = new String[capacidade];
    }
    
    private void verificarFaixa(int posicao){
        if(!(posicao >=0 && posicao < tamanho))
            throw new RuntimeException ("Argumento inválido");
    }
    
    private void aumentarCapacidade(){
        if(tamanho == elementos.length){
            String elementosNovos[] = new String [elementos.length * 2];
            for(int i = 0; i<elementos.length; i++){
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }
    
    @Override
    public void adicionar(String elemento) {
        aumentarCapacidade();
        this.elementos[this.tamanho] = elemento;
        tamanho++;
    }

    @Override
    public void adicionar(int posicao, String elemento) {
        verificarFaixa(posicao);
        aumentarCapacidade();
        for(int i = tamanho -1; i >=posicao; i--){
            elementos[i+1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
    }

    @Override
    public void remover(int posicao) {
        verificarFaixa(posicao);
        for(int i = posicao; i <tamanho -1; i++){
            elementos[i] = elementos[++i];
        }
        tamanho--;
    }

    @Override
    public String buscar(int posicao) {
        verificarFaixa(posicao);
        return elementos[posicao];
    }

    @Override
    public int buscar(String elemento) {
        int resultado = -1;
        for(int i = 0; i< tamanho; i++){
            if(elementos[i].equals(elemento))
                resultado = i;
        }
        
        return resultado;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }
    
    
    
    
    public String[] getElementos() {
        return elementos;
    }

    public void setElementos(String[] elementos) {
        this.elementos = elementos;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    
}
