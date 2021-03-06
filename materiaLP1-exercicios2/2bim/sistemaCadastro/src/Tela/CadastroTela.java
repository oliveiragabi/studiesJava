package Tela;
import javax.swing.JOptionPane;
import Dados.EstruturaDados;
import java.text.ParseException;
import javax.xml.bind.DatatypeConverter;


public class CadastroTela {
    //declarando variaveis
    private String nome;
    private String id;
    private int idade;       
     
 public CadastroTela(){
 
 }
 
 public void EntradaDados()  throws ParseException{
   //tela cadastro de nome
     String nome = JOptionPane.showInputDialog(null, "Informe o seu nome:", "Cadastro", JOptionPane.QUESTION_MESSAGE);
     setNome(nome);
     // tela cadastro de id
     String id =  JOptionPane.showInputDialog(null, "Informe o seu id:", "Cadastro", JOptionPane.QUESTION_MESSAGE);
     setId(id);
     //tela cadastro de idade
     int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade:", "Cadastro", JOptionPane.PLAIN_MESSAGE));
     setIdade(idade);
     
 }
  public void avisoInvalido(String motivo)
        {
            String msgInvalido = String.format("O cadastro não pode ser concluído \n Motivo: %s", motivo)  ; 
            JOptionPane.showMessageDialog(null, msgInvalido , "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        public void msgTela(String msgDescricao) 
        {
            JOptionPane.showMessageDialog(null, msgDescricao , "Aviso", JOptionPane.INFORMATION_MESSAGE);	
        }
    
        //criando metodo para mostrar tela de menu
        public String telaMenu () 
        {
            String msgEntradaTela  = String.format("SISTEMA DE CADASTRO \nSelecione uma opção:\n1-. Realizar Inclusao de Alunos\n2-. Realizar Consulta\n3-. Encerrar programa")  ;	
            return   JOptionPane.showInputDialog(null, msgEntradaTela , "Sistama Cadastro - Menu", JOptionPane.QUESTION_MESSAGE);  
        }
        
        public void mostrarTela(EstruturaDados dados){
            String nome = dados.getNome();
            String id = dados.getId();
            int idade = dados.getIdade();
            
             String tela = String.format("Nome: %s \nID: %s \nidade:",nome,id,idade);
         
        //exibindo tela com o texto sobre os dados sendo armazenado pela String tela
        JOptionPane.showMessageDialog(null,tela, "Consulta de dados", JOptionPane.INFORMATION_MESSAGE);
        
    
        }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
 
 
    
}
