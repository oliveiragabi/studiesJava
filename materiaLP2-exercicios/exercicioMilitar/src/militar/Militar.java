package militar;

public class Militar {

    private String nome;
    private Integer idade;

    public Militar(String nome, Integer idade) {
        this.nome = "";
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

    public String toString(Object obj) {
        return "[nome =" + nome + "idade" + idade + "]";
    }

    @Override
    public boolean equals(Object obj) {
        Militar m1 = (Militar) obj;

        if (this.nome.equals(m1.getNome()) && this.idade.equals(m1.getIdade())) {
            return true;
        } else {
            return false;
        }
    }

}
