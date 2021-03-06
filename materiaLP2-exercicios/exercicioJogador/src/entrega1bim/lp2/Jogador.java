package entrega1bim.lp2;

public class Jogador extends Atleta {
    
    private Integer numero;
    private String time;
    
    public Jogador() {
    }
    
    public Jogador(Integer numero, String time) {
        super();
        this.numero = numero;
        this.time = time;
    }
    
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
    
    @Override
    public void setIdade(Integer idade) {
        super.setIdade(idade);
    }
    
    public Integer getNumero() {
        return numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    public String getTime() {
        return time;
    }
    
    public void setTime(String telefone) {
        this.time = telefone;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Numero: " + this.numero + " Time: " + this.time;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        result = prime * result + ((time == null) ? 0 : time.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        Jogador j1 = (Jogador) obj;
        
        if (!super.equals(j1)) {
            return false;
        }
        if (this.time == null) {
            if (j1.time != null) {
                return false;
            }
        } else if (!this.time.equals(j1.time)) {
            return false;
        }
        if (this.numero == null) {
            if (j1.numero != null) {
                return false;
            }
        } else if (!this.numero.equals(j1.numero)) {
            return false;
        }
        return true;
    }
    
}
