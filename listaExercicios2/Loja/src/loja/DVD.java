package loja;


import loja.Produto;
import loja.Vendavel;

public class DVD extends Produto implements Vendavel
{
    public DVD (double precoCompra, String descricao) 
    {
        super (precoCompra,descricao);
    }
    
    @Override 
    public double getValorVenda () 
    {
        return precoCompra * 1.6;
    }
}
