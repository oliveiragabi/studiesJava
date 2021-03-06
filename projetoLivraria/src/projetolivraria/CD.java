
package projetolivraria;

public class CD extends Produto implements Vendavel {
    public CD(double precoCompra,String descricao, String banda, int numFaixas){
        super(precoCompra,descricao);
    }
    
    @Override
    public double getValorVenda(){
        return precoCompra * 1.3;
    }
}
