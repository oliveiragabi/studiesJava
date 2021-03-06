package ex1estruduradados;

import java.util.Arrays;

public class Vetor implements VetorInterface {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String [capacidade];
        this.tamanho = 0;
    }
    
    
    public int tamanho(){
        return this.tamanho;
    }
    
    
    @Override
    public void adicionar(String elemento) {
       if(this.tamanho < this.elementos.length){
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
       } else {
           throw new RuntimeException("O vetor está cheio");
       }
    }
    

    @Override
    public void adicionar(int posicao, String elemento) {
        if(!( posicao >= 0 && posicao < tamanho)){
             throw new RuntimeException ("Argumento inválido");
        }
        
        for (int i =0; this.tamanho-1 >= posicao; i--){
             this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        
    }

    @Override
    public void remover(int posicao) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new RuntimeException ("Argumento inválido");
        }
        
        for (int i = posicao; i < tamanho-1; i++){
             this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    @Override
    public String buscar(int posicao) {
        return null;
        
    }

    @Override
    public int buscas(String elemento) {
     for(int i = 0; i< this.tamanho; i++){
            if(this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
    
    public String toString(){
        String texto = "";
        for (String elemento : elementos){
             texto += elemento + " , ";
        }
          return texto;
    }

    @Override
    public void aumentarCapacidade() {
        if(this.tamanho == this.elementos.length) {
        String [] elementosNovos = new String [this.elementos.length * 2];
        for(int i = 0; i < this.elementos.length; i++){
            elementosNovos[i] = elementos [i];
        }
        this.elementos = elementosNovos;
        }
    
    
    }
    
    
     private int verificarPosicao(String elemento) {
         for(int i = 0; i<this.tamanho; i++) {
             if(this.elementos[i].equals(elemento)){
             return i;
             }
         }
      return -1;
     }
    
    
    
}
