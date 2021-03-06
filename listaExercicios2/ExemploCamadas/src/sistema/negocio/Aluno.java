package sistema.negocio;

public class Aluno 
{
    private String prontuario;
    private String nome;
    private String email;
    private String telefone;

    public Aluno(String prontuario, String nome, String email, String telefone) 
    {
        this.prontuario = prontuario;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getProntuario() 
    {
        return prontuario;
    }

    public void setProntuario(String prontuario) 
    {
        this.prontuario = prontuario;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getTelefone() 
    {
        return telefone;
    }

    public void setTelefone(String telefone) 
    {
        this.telefone = telefone;
    }

    @Override
    public String toString() 
    {
        String texto = prontuario + "," + nome + "," + email + "," + telefone; //Vai exibir isso
        return texto; 
    } 
}
