package sistema.servico;

import java.util.List;
import sistema.negocio.Aluno;

public interface AlunoServicoInterface //Baseado nos casos de uso. Sempre recebe os dados da tela
{
    public void cadastrar (String prontuario, String nome, String email, String telefone); //Cadastra os alunos precisando receber os parâmetros do construtor de Aluno
    
    public List <Aluno> listarTodos (); //Ele devolve uma lista de alunos, não recebe nada de parâmetro, pois apenas mostra
    
    public List <Aluno> pesquisarPorProntuario (String prontuario); //Recebe e retorna coisas na tela
    
    public void atualizar (String prontuario, String nome, String email, String telefone);
    
    public void excluir (String prontuario);
}
