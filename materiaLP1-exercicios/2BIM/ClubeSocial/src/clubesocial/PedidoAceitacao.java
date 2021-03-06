package clubesocial;

import java.util.ArrayList;
import java.util.Date;


public class PedidoAceitacao {
    private Date dataPedido;
    private int numeroPedido;
    private boolean situacaoPedido;
    private int numeroSocioIndicacao1;
    private int numeroSocioIndicacao2;
    private String nomeCandidato;
    private String enderecoCandidato;
    private String telefone;
    private double rendaMensal;
    private int numeroDependentes;
    private ArrayList <Dependente> dependentes;
 
    public PedidoAceitacao(Date dataPedido, int numeroPedido, boolean situacaoPedido, int numeroSocioIndicacao1, int numeroSocioIndicacao2, String nomeCandidato, String enderecoCandidato, String telefone, double rendaMensal, int numeroDependentes ){
        this.dataPedido = dataPedido;
        this.numeroPedido = numeroPedido;
        this.situacaoPedido = situacaoPedido;
        this.numeroSocioIndicacao1 = numeroSocioIndicacao1;
        this.numeroSocioIndicacao2 = numeroSocioIndicacao2;
        this.nomeCandidato = nomeCandidato;
        this.enderecoCandidato = enderecoCandidato;
        this.telefone = telefone;
        this.rendaMensal = rendaMensal;
        this.numeroDependentes = numeroDependentes;
        this.dependentes = new ArrayList <> ();
    }
    
    public Date getDataPedido(){
        return dataPedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public PedidoAceitacao() {
    }

    public int getNumeroSocioIndicacao1() {
        return numeroSocioIndicacao1;
    }

    public int getNumeroSocioIndicacao2() {
        return numeroSocioIndicacao2;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public String getEnderecoCandidato() {
        return enderecoCandidato;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public int getNumeroDependentes() {
        return numeroDependentes;
    }
    
    public void setDataPedido(Date dataPedido){
        
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void setSituacaoPedido(boolean situacaoPedido) {
        if(SituacaoPedido = aprovado )
        
        this.situacaoPedido = situacaoPedido;
    }

    public boolean isSituacaoPedido() {
        return situacaoPedido;
    }

    public void setNumeroSocioIndicacao1(int numeroSocioIndicacao1) {
        this.numeroSocioIndicacao1 = numeroSocioIndicacao1;
    }

    public void setNumeroSocioIndicacao2(int numeroSocioIndicacao2) {
        this.numeroSocioIndicacao2 = numeroSocioIndicacao2;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public void setEnderecoCandidato(String enderecoCandidato) {
        this.enderecoCandidato = enderecoCandidato;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public void setNumeroDependentes(int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }
}
