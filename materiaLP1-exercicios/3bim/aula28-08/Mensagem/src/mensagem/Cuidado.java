
package mensagem;

import javax.swing.JOptionPane;

public class Cuidado extends Sucesso implements Alerta {
    public void showMsg(String Texto, int icone)
    {
        JOptionPane.showMessageDialog(null, Texto, "Mensagem", icone);
    }
    
    //meodo principal
    
    public static void main (String args[]){
    
        // criando instancia cuidado
        Cuidado objCuidado = new Cuidado();
        
        //exibindo conteudo do atributo bemvindo da interface mensagem
        objCuidado.showMsg(bemVindo);
        
        //exibindo conteudo de cautela da interface Alerta
        objCuidado.showMsg(Cautela, 2);
        
        //exibindo o conteudo de dmora da interface alrta
        objCuidado.showMsg(Demora, 2);
    
    
    try
    {
        Thread.sleep(3000);
    }
    catch (Exception ex)
    {
    JOptionPane.showMessageDialog(null, "Erro");
    }
    
    objCuidado.showMsg(sucesso);
    
    System.exit(0);
    
}
}
