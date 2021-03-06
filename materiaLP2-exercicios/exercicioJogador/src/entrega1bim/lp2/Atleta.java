package entrega1bim.lp2;

import java.util.Objects;

public class Atleta {

    private String nome;
    private Integer idade;

    public Atleta() {
    }

    public Atleta(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((idade == null) ? 0 : idade.hashCode());
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
        
        Atleta a1 = (Atleta) obj;

        if (this.nome == null) {
            if (a1.nome != null) {
                return false;
            }
        } else if (!this.nome.equals(a1.nome)) {
            return false;
        }
        if (this.idade == null) {
            if (a1.idade != null) {
                return false;
            }
        } else if (!this.idade.equals(a1.idade)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atleta =" + " nome: " + nome + ", idade: " + idade;
    }

}
