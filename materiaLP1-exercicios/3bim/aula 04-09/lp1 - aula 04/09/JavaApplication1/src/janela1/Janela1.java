package janela1;
//importando classe
import java.awt.*;
//criando classe

public class Janela1 extends Frame {

    //metodo principal
    
    public static void main(String[] args) {
        //criando uma instancia de frame
        Frame objFrame = new Frame();
        
        //tamanho da janela, altura e largura
       objFrame.setSize(200, 300);
        
        //criar um metodo pra exibir o obj frame
        objFrame.show();
     
        
        
    }
}
