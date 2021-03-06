package janela1;
import java.awt.*;
import java.awt.event.*;

public class TesteGUI extends Frame {
    
    //DECLARANDO BOTAO DE SAIR
    Button btnSair;
    
    //CRIANDO UM CONSTRUTOR PARA DEFINIR O TAM. DA JANELA
    TesteGUI(){
    
        //TAMANHO DA JANELA 
        setSize(200,400);
        
        //desabilitando layout
        setLayout(null);
        
        //instanciando botao
        btnSair = new Button("Sair");
        
        //dimensionar botao
        //x e y, coordenadas
        //1 e a (largura e altura)
        btnSair.setBounds(new Rectangle (100,100,60,30));
        
        //tornando a janela vsivel 
        setVisible(true);
        
        //ouvir janela
        addWindowListener(new FechaJanela());
        
        add(btnSair);
        
        //ouvir o btn
        btnSair.addActionListener(new VerEventos());
    }
    
    //criar a classe internna ver eventos
    class VerEventos implements ActionListener
    {
    
        //metodo para verificar qual componente foi utilizado
        public void actionPerformed(ActionEvent e)
        {
        
            if(e.getSource() == btnSair)
                System.exit(0);
                
        
        }

        
    }
    
}
