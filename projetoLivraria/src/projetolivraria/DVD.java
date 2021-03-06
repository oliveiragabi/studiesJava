package projetolivraria;

public class DVD extends Produto implements Vendavel {
    public DVD(double precoCompra, String descricao){
        super(precoCompra, descricao);       
    }
    @Override
    public double getValorVenda(){
        return precoCompra * 1.3;
    }
    
}
