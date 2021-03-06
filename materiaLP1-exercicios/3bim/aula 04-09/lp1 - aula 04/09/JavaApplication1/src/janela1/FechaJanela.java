package janela1;

import java.awt.event.WindowAdapter;
import java.awt.event.*;

class FechaJanela extends WindowAdapter 
{
    //criando método para fechar janela
    public void windowClosing (WindowEvent e )
    {
     
    System.exit(0);
   
    }
    
 }
    

