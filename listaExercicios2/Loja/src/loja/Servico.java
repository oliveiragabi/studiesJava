package loja;

public abstract class Servico 
{
    protected double valor;
    protected int duracao;
    
    public Servico (double valor, int duracao) 
    {
        this.valor = valor;
        this.duracao = duracao;
    }
}
