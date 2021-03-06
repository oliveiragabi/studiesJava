package cliente;

public class Cliente {
   private String nome;
   private Endereço endereço;
   private Telefone telefone;
   
   public Cliente (String nome, Telefone telefone, Endereço endereço){
   this.nome = nome;
   this.endereço = endereço;
   this.telefone = telefone;
   }
   
   public String getNome(){
       return nome;
   }
   
   public Endereço getEndereço(){
       return endereço;
   }
  
   public Telefone getTelefone(){
       return telefone;
   }
   
   public void setTelefone(){
     this.telefone = telefone;
   }
   
   public void setEndereço(){
       this.endereço = endereço;
   }
   }

