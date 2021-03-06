package sistema;

import sistema.dados.AlunoDAO;
import sistema.dados.AlunoDadosInterface;
import sistema.dados.AlunoDadosMemoria;
import sistema.negocio.Aluno;
import sistema.servico.AlunoServico;

public class SistemaMain 
{
    public static void main(String[] args) 
    {
        //AlunoDadosInterface alunoDados = new AlunoDadosMemoria ();
        AlunoDAO dados = new AlunoDAO();
        AlunoServico alunoServico = new AlunoServico (dados);
        
        //System.out.println (alunoDados.listarTodos().size());
        
        /*alunoServico.cadastrar("155555", "João", "jkkk@gmail.com", " ");
        alunoServico.cadastrar("152222", "Joana", "joana@gmail.com", " ");
        alunoServico.cadastrar("165555", "José", "jose@gmail.com", " ");
        alunoServico.atualizar("165555", "Xuxu", "meloisa042@gmail.com", "24360605");
        
        alunoServico.excluir("152222");*/

        System.out.println (dados.listarTodos().size());
                
        for (Aluno aluno : alunoServico.listarTodos()) //Lado antes do ponto é o que eu irei tirar da lista, e o que está do outro lado é a lista da onde estou tirando.
        {
            System.out.println (aluno.getProntuario() + "," + aluno.getNome());
        }
        
       /*for (Aluno aluno : alunoServico.listarTodos ()) //Uma outra forma de exibir. Observar a classe Aluno.
        {
            System.out.println (aluno);
        }*/
        
        System.out.println ("----------- PESQUISA POR PRONTUÁRIO ---------------");
        
        for (Aluno aluno : alunoServico.pesquisarPorProntuario("15")) //Uma outra forma de exibir. Observar a classe Aluno. Vai procurar  e exibir os pront que têm 15.
        {
            System.out.println (aluno);
        }
    }
}
