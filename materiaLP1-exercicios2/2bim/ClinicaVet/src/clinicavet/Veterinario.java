package clinicavet;

public class Veterinario {
   protected String nomeVet;
   protected String especialidade;
   protected String CRM;
   
 public  Veterinario(String nomeVet, String especialidade, String CRM){
    this.nomeVet = nomeVet;
    this.especialidade = especialidade;
    this.CRM = CRM;
 }
 
 public String getnomeVet(){
     return nomeVet;
 }
 
 public String getEspecialidade(){
     return especialidade;
 }
 
 public String getCRM(){
     return CRM;
 }
 
 public void setnomeVet(String nomeVet){
     this.nomeVet = nomeVet;
 }
 
 public void setEspecialidade(String especialidade){
     this.especialidade= especialidade;
 }
 
 public void setCRM(String CRM){
     this.CRM = CRM;
 }
}
