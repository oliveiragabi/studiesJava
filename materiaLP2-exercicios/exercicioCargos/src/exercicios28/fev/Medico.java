package exercicios28.fev;

import java.util.Date;
import java.util.Objects;

public class Medico implements Cloneable {

    private String nome;
    private Integer idade;
    private Date dataAdmissao;
    private String email;

    public Medico(String nome, Integer idade, Date dataAdmissao, String email) {
        this.nome = nome;
        this.idade = idade;
        this.dataAdmissao = dataAdmissao;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = 31 * hash + Objects.hashCode(this.nome);
        hash = 31 * hash + Objects.hashCode(this.idade);
        hash = 31 * hash + Objects.hashCode(this.dataAdmissao);
        hash = 31 * hash + Objects.hashCode(this.email);
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
        final Medico other = (Medico) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.idade, other.idade)) {
            return false;
        }
        if (!Objects.equals(this.dataAdmissao, other.dataAdmissao)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Medico{" + "nome=" + nome + ", idade=" + idade + ", dataAdmissao=" + dataAdmissao + ", email=" + email + '}';
    }
    
    public Medico clone() {
        return null;
    
    
    } 
    
}
