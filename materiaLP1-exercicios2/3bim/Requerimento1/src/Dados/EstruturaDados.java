
package Dados;


import java.time.LocalDate;


public class EstruturaDados {
    private boolean deferido;
    private String nome;
    private String prontuario;
    private String turma;
    private LocalDate dataAfastamento;
    private char justificativa;
  
   
    public EstruturaDados(boolean deferido, String nome, String prontuario, String turma, LocalDate dataAfastamento, char justificativa){
    this.deferido = deferido;
    this.nome = nome;
    this.prontuario = prontuario;
    this.turma = turma;
    this.dataAfastamento = dataAfastamento;
    this.justificativa = justificativa;
    }
    
    public boolean getDeferido(){
        return deferido;
    }
    public String getNome(){
        return nome;
    }
    
    public String getProntuario(){
        return prontuario;
    }
    
    public String getTurma(){
        return turma;
    }
    public LocalDate getDataAfastamento(){
        return dataAfastamento;
    }
    
    public char getJustificativa(){
        return justificativa;
    }
    
    public void setDeferido(){
        
    }
    
    public void setNome(String nome){
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
        this.nome=nome;
    }
    
    public void setProntuario(String prontuario){
        if(prontuario.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
         this.prontuario=prontuario;
    }  
    
    public void setTurma(String Turma){
        if(turma.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
        this.turma = turma;
    }
    
    public void setdataAfastamento(LocalDate dataAfastamento){
        if(dataAfastamento == null){
            throw new NullPointerException("A data de afastamento não pode ser nula!!");
            
        } 
        this.dataAfastamento = dataAfastamento;
    }

    }


