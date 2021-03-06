
package projetolivraria;


public class RevisaoLivro extends Servico implements Vendavel {
    public RevisaoLivro(double valor, int duracao){
        super(valor, duracao);
    }
    
    @Override
    public double getValorVenda(){
        return valor * duracao;
    }
    
}
