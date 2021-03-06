package cliente;

public class Endereço {
    private String logradouro;
    private String cep;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;
     
    public Endereço(String logradouro, String cep, String numero, String bairro, String cidade, String uf){
    this.logradouro = logradouro;
    this.cep = cep;
    this.numero = numero;
    this.bairro = bairro;
    this.cidade = cidade;
    this.uf = uf;
    }
    
    public String getLogradouro(){
        return logradouro;
    }
    
    public String getCep(){
        return cep;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public String getBairro(){
        return bairro;
    }        
    
    public String getCidade(){
        return cidade;
    }
    
    public String getUf(){
        return uf;
    }
    
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    
    public void setCep(String cep){
         if (cep.trim().isEmpty()){
        throw new IllegalArgumentException();
    }
        this.cep = cep;
    }
    
    public void setBairro(String bairro){
        if (bairro.trim().isEmpty()){
        throw new IllegalArgumentException();
    }
        this.bairro = bairro;
    }
    
    public void setCidade (String cidade){
     if (cidade.trim().isEmpty()){
        throw new IllegalArgumentException();
    }
     this.cidade = cidade;
    }
    
    public void setUf(String uf){
     if (uf.trim().isEmpty()){
    throw new IllegalArgumentException();
    }
     this.uf = uf;
    }
    
    public void setNumero(String numero){
      if (numero.trim().isEmpty()){
        throw new IllegalArgumentException();
    }
      this.numero = numero;
    }

}
