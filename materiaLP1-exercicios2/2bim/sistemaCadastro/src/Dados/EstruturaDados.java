package Dados;

public class EstruturaDados {
    
    private String id;
    private String nome;
    private int idade; 
    private String opcao;
   

    public EstruturaDados() {
    } 

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }

    public EstruturaDados(String id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        
        this.idade = idade;
    }


    }

