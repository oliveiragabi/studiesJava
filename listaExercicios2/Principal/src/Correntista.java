
import java.util.ArrayList;


public class Correntista 
{
    private int codigo;
    private String nome;
    private ArrayList<Conta> contas;
    
    public Correntista (int codigo, String nome) 
    {
        this.codigo = codigo;
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() 
    {
        return nome;
    }

    public int getCodigo() 
    {
        return codigo;
    }

    public ArrayList<Conta> getContas() 
    {
        return contas;
    }
    
    
    
    
    
}
