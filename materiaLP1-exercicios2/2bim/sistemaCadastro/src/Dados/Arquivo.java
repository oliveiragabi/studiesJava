package Dados;
import Tela.CadastroTela;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Arquivo {
    
    
    
    public static String Read(String caminho) {                 //Método para recuperar dados do arquivo .txt, gravado anteriromente
        String conteudo = "";
        try {
            FileReader arq = new FileReader(caminho);          //Instancia classe que manipula arquivo (Localiza o arquivo)  
            BufferedReader lerArq = new BufferedReader(arq);   //leitura do arquivo: Se tudo 
            String linha = "";
            try
            {
                linha = lerArq.readLine();                    // Se leitura OK,  transfere o conteúdo da linha do arquivo, para a String "linha" (obedecendo o layout comentado na classe "Principal")
                while (linha!=null) {
                    conteudo += linha+"\n";
                    linha = lerArq.readLine();
                }
                arq.close();
                return conteudo;
            } catch (IOException ex) {
                System.out.println( "Erro: nao foi possivel ler o arquivo");
                return "";
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo não encontrado");
            return "";
        }  
        
    }
  public static boolean Write(String caminho, String texto) {   //Método par gravar arquivo no caminho solicitado
      try {
          FileWriter arq = new FileWriter(caminho);
          PrintWriter gravaArq = new PrintWriter(arq);
          gravaArq.println(texto);
          gravaArq.close();    
          return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    public static EstruturaDados acessaDados () { //método para formatar dados 
         String arq = "C:\\Users\\gabik\\Documents\\IFSP\\LP1 - Aulas\\2bim\\sistemaCadastro.txt";
         String conteudo = Arquivo.Read(arq);
         String nome = conteudo.split(";")[0];
         String id = conteudo.split(";")[1];
         int idade = Integer.parseInt(conteudo.split(";")[2]);
         //   int  codigoTipoPacote = Integer.parseInt(conteudo.split(";")[0]);
         
         
        
       //Note: Quando gravamos o arquivo, tínhamos 2 códigos (CodTipoPacot; CodtTipoUrnaFuneraria).
       //Observe que dentro do arquivo não temos descrição,mas nós criamos estas desrição aqui e as 
       //colocamos na estrutura
         
         EstruturaDados dados = new EstruturaDados();
         dados.setNome(nome);
         dados.setIdade(idade);
         dados.setId(id);
       
         
         
         
     
         return dados;  //retorna a estrutura de "EstruturaDados" no objeto "dados"
            
   
    }
}

