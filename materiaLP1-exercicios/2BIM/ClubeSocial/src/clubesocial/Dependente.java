package clubesocial;

public class Dependente {
    private long cartao_dep;
    private String nome_dep;
    private String parentesco;
    private String email_dep;
    
    public long regDep(){
        return 0;   
    }
    
    public Dependente(long cartao_dep, String nome_dep, String parentesco, String email_dep){
        this.cartao_dep = cartao_dep;
        this.nome_dep = nome_dep;
        this.parentesco = parentesco;
        this.email_dep = email_dep;
    }

    public long getCartao_dep() {
        return cartao_dep;
    }

    public String getNome_dep() {
        return nome_dep;
    }

    public String getParentesco() {
        return parentesco;
    }

    public String getEmail_dep() {
        return email_dep;
    }

    public void setCartao_dep(long cartao_dep) {
        this.cartao_dep = cartao_dep;
    }

    public void setNome_dep(String nome_dep) {
        this.nome_dep = nome_dep;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public void setEmail_dep(String email_dep) {
        this.email_dep = email_dep;
    }
    
    
}
