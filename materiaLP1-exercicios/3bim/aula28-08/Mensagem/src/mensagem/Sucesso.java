
package mensagem;
import javax.swing.JOptionPane;

public class Sucesso implements Mensagem {
    //ação do metodo showmsg
    public void showMsg(String texto)
    {
    JOptionPane.showMessageDialog(null, texto, "Mensagem", 1);
    }
//metodo principal
    public static void main (String args []){
    Sucesso objSucesso =  new Sucesso();
    //inserindo conteudo de bemvindo em st
    
    String st = objSucesso.bemVindo;
    
    //chamado metdo show msg
    objSucesso.showMsg(st);
    
    // variavel = instancia de sucesso.atributo
    st = objSucesso.sucesso;
    objSucesso.showMsg(st);
    
    System.exit(0);
    
    
    }
}
