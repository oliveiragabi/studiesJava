package sistema.dados;

import java.util.List;
import sistema.negocio.Aluno;

public interface AlunoDadosInterface 
{
    public void salvar (Aluno aluno); //Está recebendo o objeto que criei em serviço.
    
    public List <Aluno> listarTodos ();
    
    public List <Aluno> pesquisarPorProntuario (String prontuario);
    
    public void atualizar (Aluno aluno);
    
    public void excluir (String prontuario);
}
