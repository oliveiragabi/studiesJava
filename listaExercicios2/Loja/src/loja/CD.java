package loja;

public class CD extends Produto implements Vendavel 
{
    public CD (double precoCompra, String descricao) 
    {
        super (precoCompra,descricao);
    }
    
    @Override 
    public double getValorVenda () 
    {
        return precoCompra * 1.3;
    }
    
}
