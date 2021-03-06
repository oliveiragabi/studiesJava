package projetolivraria;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private LocalDate data;
    private List<Vendavel> itens;
    
    public Venda(){
        this.data = LocalDate.now();
        itens = new ArrayList<>();
    }
    
    public void addItem(Vendavel v){
        this.itens.add(v);
    }
    
    public double getValorTotalVendas(){
        double valor = 0;
        for (Vendavel vendavel : itens){
            valor += vendavel.getValorVenda();
        }
        return valor;
    }
    
}
