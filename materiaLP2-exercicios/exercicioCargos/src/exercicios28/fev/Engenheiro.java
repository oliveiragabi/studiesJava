package exercicios28.fev;

import java.util.Objects;


public class Engenheiro implements Cloneable {
    private String nome;
    private Integer crea;  

    public Engenheiro(String nome, Integer crea) {
        this.nome = nome;
        this.crea = crea;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCrea() {
        return crea;
    }

    public void setCrea(Integer crea) {
        this.crea = crea;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = 31 * hash + Objects.hashCode(this.nome);
        hash = 31 * hash + Objects.hashCode(this.crea);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Engenheiro other = (Engenheiro) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.crea, other.crea)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Engenheiro{" + "nome=" + nome + ", crea=" + crea + '}';
    }
    
    public Engenheiro clone() throws  CloneNotSupportedException {
       Engenheiro clonado = (Engenheiro) super.clone();
       
       return clonado;
    
    }
    
}
