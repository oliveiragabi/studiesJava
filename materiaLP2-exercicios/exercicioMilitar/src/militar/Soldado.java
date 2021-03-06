package militar;

import java.time.LocalDate;

public class Soldado extends Militar {
    
    private LocalDate dataIngresso;
    private Integer numeroFuncional;

    public Soldado(LocalDate dataIngresso, Integer numeroFuncional, String nome, Integer idade) {
        super(nome, idade);
        this.dataIngresso = dataIngresso.now();
        this.numeroFuncional = numeroFuncional;
    }

    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(LocalDate dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public Integer getNumeroFuncional() {
        return numeroFuncional;
    }

    public void setNumeroFuncional(Integer numeroFuncional) {
        this.numeroFuncional = numeroFuncional;
        
    }
    
    public String toString(Object obj){
        return  this.getClass() + super.toString()+ "[dataIngresso" + dataIngresso + "numeroFuncional" + numeroFuncional +"]";
    }
    
    public boolean equals(Object obj){
        Soldado s1 = (Soldado) obj;
        
        if(this.dataIngresso.equals(s1.getDataIngresso()) && this.numeroFuncional.equals((s1.getNumeroFuncional())))
            return true;
        else
            return false;
    
    }
    
}
