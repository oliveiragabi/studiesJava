package sistema.dados;

import java.util.ArrayList;
import java.util.List;
import sistema.negocio.Aluno;

public class AlunoDadosMemoria implements AlunoDadosInterface
{
    private List <Aluno> tabelaAlunos; //SIMULA a tabela Alunos no BDD.

    public AlunoDadosMemoria () 
    {
        tabelaAlunos = new ArrayList <> (); //Inicializando a lista.
    }
          
    @Override
    public void salvar(Aluno aluno) 
    {
        tabelaAlunos.add(aluno); //Adiciando aluno na lista de alunos
    }

    @Override
    public List<Aluno> listarTodos() 
    {
        return tabelaAlunos;
    }

    @Override
    public List<Aluno> pesquisarPorProntuario(String prontuario) 
    {
        List<Aluno> alunosEncontrados = new ArrayList <> (); //Uma lista temporária
        
        for (Aluno aluno : tabelaAlunos) //For int
        {
            if (aluno.getProntuario().contains (prontuario)) //O contains vai procurar a String prontuario dentro do getProntuario
            {
                alunosEncontrados.add(aluno);
            }
        }
        
        return alunosEncontrados;  
    }

    @Override
    public void atualizar(Aluno aluno) //Só implementei para parar de dar erro
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(String prontuario) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
