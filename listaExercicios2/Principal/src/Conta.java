import java.time.LocalDate;

public class Conta 
{
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
    private Correntista correntista;
    
    public Conta (int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista) 
    {
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
        this.tarifa = tarifa;
        this.correntista = correntista;
    }
    
    public void sacar (double valor) 
    {
        if (saldo > valor)
        this.saldo = saldo - valor;
    }
    
    public void depositar (double valor) 
    {
        this.saldo = saldo + valor;
    }
    
    public double calcularTarifa ()
    {
        return tarifa;
    }
}
