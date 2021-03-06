package sistema.servico;

import java.util.List;
import sistema.dados.AlunoDadosInterface;
import sistema.negocio.Aluno;

public class AlunoServico implements AlunoServicoInterface
{
    private AlunoDadosInterface alunoDados;

    public AlunoServico(AlunoDadosInterface alunoDados) 
    {
        this.alunoDados = alunoDados;
    }
 
    @Override
    public void cadastrar(String prontuario, String nome, String email, String telefone) 
    {
       Aluno aluno = new Aluno(prontuario, nome, email, telefone); //Está criando um objeto de negócio (Aluno)
       
       alunoDados.salvar(aluno);      
    }

    @Override
    public List<Aluno> listarTodos() 
    {
        return alunoDados.listarTodos();
    }

    @Override
    public List<Aluno> pesquisarPorProntuario(String prontuario) 
    {
        return alunoDados.pesquisarPorProntuario(prontuario);
    }

    @Override
    public void atualizar(String prontuario, String nome, String email, String telefone) 
    {
       Aluno aluno = new Aluno(prontuario, nome, email, telefone); //Está criando um objeto de negócio (Aluno)
       
       alunoDados.atualizar(aluno);      
    }

    @Override
    public void excluir(String prontuario) 
    {
        alunoDados.excluir(prontuario);
    }
}
