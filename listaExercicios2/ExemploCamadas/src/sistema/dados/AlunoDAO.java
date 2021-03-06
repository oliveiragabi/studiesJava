package sistema.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistema.negocio.Aluno;

public class AlunoDAO implements AlunoDadosInterface
{
    private Connection conexao;
            
    @Override
    public void salvar(Aluno aluno) 
    {
        conexao = Conexao.abrir();
        
        String sql = "INSERT INTO alunos VALUES (?, ?, ?, ?);";
        try 
        {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, aluno.getProntuario()); //stmt vai colocar na posição 1 a String prontuário.
            stmt.setString(2, aluno.getNome()); 
            stmt.setString(3, aluno.getEmail()); 
            stmt.setString(4, aluno.getTelefone()); 
            
            stmt.executeUpdate(); //Estamos mexendo no banco, colocando valores
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        
        Conexao.fechar (conexao);
    }

    @Override
    public List<Aluno> listarTodos()
    {
        List <Aluno> alunosEncontrados = new ArrayList <> ();
        
        conexao = Conexao.abrir ();
        
        String sql = "SELECT * FROM alunos;";
        try 
        {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(); //ResultSet possui um "ponteiro" que aponta pra primeira linha que tem. É  o resultado da sua consulta, não é a TABELA.
            
            while (rs.next ()) 
            {
                Aluno aluno = new Aluno (
                        rs.getString("prontuario"),
                        rs.getString("nome"), 
                        rs.getString("email"),
                        rs.getString("telefone"));
                
                alunosEncontrados.add(aluno);
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }

        Conexao.fechar (conexao);
        
        return alunosEncontrados;
    }

    @Override
    public List<Aluno> pesquisarPorProntuario(String prontuario) 
    {
       List <Aluno> alunosEncontrados = new ArrayList <> ();
        
        conexao = Conexao.abrir ();
        
        String sql = "SELECT * FROM alunos WHERE prontuario LIKE ?;";
        try 
        {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, "%" + prontuario + "%");
            ResultSet rs = stmt.executeQuery(); //ResultSet possui um "ponteiro" que aponta pra primeira linha que tem. É  o resultado da sua consulta, não é a TABELA.
            
            while (rs.next ()) 
            {
                Aluno aluno = new Aluno (
                        rs.getString("prontuario"),
                        rs.getString("nome"), 
                        rs.getString("email"),
                        rs.getString("telefone"));
                
                alunosEncontrados.add(aluno);
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }

        Conexao.fechar (conexao);
        
        return alunosEncontrados;
    }  

    @Override
    public void atualizar(Aluno aluno) 
    {
        conexao = Conexao.abrir();
        
        String sql = "UPDATE alunos SET nome = ?, email = ?, telefone = ? WHERE prontuario = ?;";
        try 
        {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, aluno.getNome()); 
            stmt.setString(2, aluno.getEmail()); 
            stmt.setString(3, aluno.getTelefone());
            stmt.setString(4, aluno.getProntuario());
            
            stmt.executeUpdate(); //Estamos mexendo no banco, colocando valores
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        
        Conexao.fechar (conexao);
    }

    @Override
    public void excluir(String prontuario) 
    {
        conexao = Conexao.abrir();
        
        String sql = "DELETE FROM alunos WHERE prontuario = ?;";
        try 
        {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, prontuario);
            
            stmt.executeUpdate(); //Estamos mexendo no banco, colocando valores
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        
        Conexao.fechar (conexao);
    }
}
