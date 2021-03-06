package clinicavet;

import java.time.LocalDate;

public class Consulta extends Veterinario{
    private LocalDate dataConsulta;
    private String descricaoConsulta;

    public Consulta(String nomeVet, String especialidade, String CRM, String descricaoConsulta, LocalDate dataConsulta) {
        super(nomeVet, especialidade, CRM);
        this.dataConsulta = dataConsulta;
        this.descricaoConsulta = descricaoConsulta;
    }
    
    public LocalDate getDataConsulta(){
        return dataConsulta;
    }
    
    public String getDescricaoConsulta(){
        return descricaoConsulta;
    }
    
    public String nomeVet(){
        return nomeVet;
    }
    
    public void setDataConsulta(){
        this.dataConsulta = dataConsulta;
    }
    
    public void setDescricaoConsulta(){
        this.descricaoConsulta = descricaoConsulta;
    }
    
    
    
    

    
      }
    

