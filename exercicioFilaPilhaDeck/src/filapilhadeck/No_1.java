package listaduplamenteencadeada;


public class No<t> {
    No<t> anterior;
    t elemento ;
    No<t> proximo;

    public No(No<t> anterior, t elemento, No<t> proximo) {
        this.anterior = anterior;
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public No<t> getAnterior() {
        return anterior;
    }

    public void setAnterior(No<t> anterior) {
        this.anterior = anterior;
    }

    public t getElemento() {
        return elemento;
    }

    public void setElemento(t elemento) {
        this.elemento = elemento;
    }

    public No<t> getProximo() {
        return proximo;
    }

    public void setProximo(No<t> proximo) {
        this.proximo = proximo;
    }
    

    
    
    
}
