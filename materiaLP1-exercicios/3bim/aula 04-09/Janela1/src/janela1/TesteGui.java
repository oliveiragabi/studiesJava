package janela1;

import java.awt.*;
import java.awt.event.*;

public class TesteGui extends Frame {
    
    
    Button btnSair;
    
    
    
    TesteGui(){
        
        setSize(200,400);
        
        setLayout(null);
        
        
        btnSair = new Button("Sair");
        
        btnSair.setBounds(new Rectangle(100,100,80,30));
        
        add(btnSair);
        
        btnSair.addActionListener(new VerEventos());
        
        setVisible(true);
        
        addWindowListener(new FechaJanela());

        
    }
    
    class VerEventos implements ActionListener {
        
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource() == btnSair)
                System.exit(0);
            
        }
    }
    
}
