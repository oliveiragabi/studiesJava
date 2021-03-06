package estruturadados;

import java.util.Arrays;

public class Vetor implements VetorInterface
{
    //Na aula de hoje (10/10) vamos mudar esse vetor de String para Object, ai terei um vetor que "cabe tudo", não é a melhor forma.
    public Object [] elementos;
    public int tamanho;

    public Vetor(int capacidade) 
    {
        this.elementos =  new Object [capacidade];
        this.tamanho = 0;
    }
    
    private void validar (int posicao) 
    {
        if (!(posicao>= 0 && posicao < tamanho)) 
        {
          throw new RuntimeException ("Argumento Inválido!!");  
        }
    }
    
    private void aumentarCapacidade () 
    {
        if (this.tamanho == this.elementos.length) 
        {
            Object [] elementosNovos = new Object [this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) 
            {
                elementosNovos [i] = elementos [i];
            }
            
            this.elementos = elementosNovos;
        }
    }
    
    @Override
    public void adicionar(Object elemento) 
    {
        aumentarCapacidade();
        
        if (this.tamanho < this.elementos.length) 
        {
            this.elementos [this.tamanho] = elemento;
            this.tamanho++;
        }
        
        else 
        {
            throw new RuntimeException ("Vetor está cheio");
        }
    }

    @Override
    public void adicionar(int posicao, Object elemento) 
    {
        aumentarCapacidade ();
        validar (posicao);
        
        for (int i = this.tamanho-1; i >= posicao; i--) 
        {
            this.elementos [i + 1] = this.elementos [i];
        }
        
        this.elementos [posicao] = elemento;
        this.tamanho++;
    }

    @Override
    public void remover(int posicao) 
    {
        validar (posicao);
        
        for (int i = posicao; i < tamanho-1; i++) 
        {
            this.elementos [i] = this.elementos [i + 1];
        }
        
        this.tamanho--;
    }

    @Override
    public Object buscar(int posicao) 
    {
        validar (posicao);
        
        return this.elementos [posicao];
    }

    @Override
    public int buscar(Object elemento) 
    {
        for (int i = 0; i < this.tamanho; i++) 
        {
            if (this.elementos [i].equals(elemento)) 
            {
                return i;
            }
        }
        
        return -1;
    }

    @Override
    public int tamanho() 
    {
        return this.tamanho;
    }
    
    public String toString ()
    {
        return Arrays.toString (this.elementos);
    }
}
