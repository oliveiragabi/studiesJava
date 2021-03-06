
package projetolivraria;

public abstract class Produto {
    protected double precoCompra;
    protected String descricao;
    
    public Produto(double precoCompra, String descricao){
        this.precoCompra = precoCompra;
        this.descricao = descricao;
    }
    
}
