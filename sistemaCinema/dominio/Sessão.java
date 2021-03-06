package sistemacinema.dominio;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Sessão {
    
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private boolean legendado;
    private Sala sala;
    private double valor;
    private ArrayList<Ingresso> ingressos;

    public Sessão(LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim, boolean legendado, Sala sala, double valor) {
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.legendado = legendado;
        this.sala = sala;
        this.valor = valor;
        this.ingressos = new ArrayList<>();
    }
     
    public void venderIngresso(boolean meiaEntrada){
        if(sala.getquantidadeLugares() > ingressos.size()) {
           
           Ingresso ingresso = new Ingresso(meiaEntrada, this);
          
           ingressos.add(ingresso);
        }
     }
    
    
     public double getValor(){
        return valor;
    }
  
    }
    
   

