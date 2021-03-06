package sistemacinema.dominio;

public class Ingresso {
    private boolean meiaEntrada; 
    private double valor;
    private Sessão sessao;       
          
    public Ingresso (boolean meiaEntrada, Sessão sessao){
      this.meiaEntrada = meiaEntrada;
      this.sessao = sessao;
      
      if(meiaEntrada){
          this.valor = sessao.getValor()/2;
       }
       else{
         this.valor = sessao.getValor();
       } 
    }
    
    public boolean isMeiaEntrada(){
        return meiaEntrada;
    }
}

