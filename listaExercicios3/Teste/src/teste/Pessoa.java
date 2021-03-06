package teste;

public class Pessoa {
    private int id = 0;
    private String nome;
    
    public Pessoa (){
    }
    
    public Pessoa(int id, String nome){
      this.id = id;
      this.nome = nome;
    }

    public int getId(){
    return this.id;
    } 
    
    public void setNome(String nome){
    this.nome = nome;
    }
    
    public String getNome(){
    return this.nome;
    }
    
    public void setId(int id){
    this.id= id;
    }

 
   
   
}


