package sistema.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao //Conectar com o banco de dados
{
    //Como esses valores não irão mudar, uso final, pois os valores NUNCA irão se alterar
    //Uso static (é um atributo da classe, não do objeto) quando as instâncias irão receber o mesmo valor
    //Por padronização escrevo em maiúsculo 
    private static final String DRIVER = "com.mysql.jdbc.Driver"; //É o caminho da localização do Driver
    private static final String URL = "jdbc:mysql://localhost:3306/exemplocamadas"; //3306 é a porta onde está rodando o MySql, e exemplocamadas é o nome do bd
    private static final String USER = "root"; //Usuário do MySql
    private static final String PASSWORD = "";
    
    //Não preciso d euma instância para executar, por causa do static
    public static Connection abrir () //Aperto crtl + barra de espaço para chegar nesse Connection 
    {
        try 
        {
            //Class é uma classe do java langh (não sei escrever), ela está pesquisando o caminho do driver (o que digitei ali no atributo)
            Class.forName (DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD); //Tentando se conectar com essas configuração de banco
        } 
        
        catch (ClassNotFoundException | SQLException e) //Juntando duas exceções em uma
        {
            throw new RuntimeException (e.getMessage());
        }
    }
    
    public static void fechar (Connection connection) 
    {
        try 
        {
            connection.close();
        } 
        
        catch (SQLException e) 
        {
            throw new RuntimeException (e.getMessage());
        }
    }
}
