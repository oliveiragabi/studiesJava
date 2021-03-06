package imobiliaria;

public class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private String endereco;
    
    public Cliente(){
    }
    
    public Cliente (String nome, String telefone, String email, String cpf, String endereco){
    this.nome=nome;
    this.telefone=telefone;
    this.email=email;
    this.endereco=endereco;
    this.cpf=cpf;
    }
    
    public String getNome(){
    return this.nome;
    }
    public String getCpf(){
    return this.cpf=cpf;
    }
    public String getTelefone(){
    return this.telefone;
    }
    
    public String getEmail(){
    return this.email;
    }
    
    public String getEndereco(){
    return this.endereco;
    }
    
    public void setTelefone(String telefone){
    this.telefone=telefone;  
    }

    public void setEmail(String email) {
    this.email = email;
    }

    public void setEndereco(String endereco) {
    this.endereco = endereco;
    }
}
