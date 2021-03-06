
package projetolivraria;

public class Livro extends Produto implements Vendavel {
    public Livro(double precoCompra, String descricao, String autos, String ISBN){
        super(precoCompra, descricao);
    }
    
    @Override
    public double getValorVenda(){
        return precoCompra * 2.0;
    }
    
}
