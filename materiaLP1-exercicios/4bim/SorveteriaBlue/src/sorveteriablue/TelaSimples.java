package sorveteriablue;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TelaSimples extends JFrame {
    public JTextField caixaTexto1;
    public JTextField caixaTexto2;
    public JTextField caixaTexto3;
    public JTextField caixaTexto4;
    public JTextField caixaTexto5;
    public JTextField caixaTexto6;
    public JTextField caixaTexto7;
    public JTextField caixaTexto8;
    public JTextField caixaTexto9;
    
    JButton botaoCalcular = new JButton ("Calcular");
    JButton botaoLimpar = new JButton ("Limpar");

public TelaSimples(){
    
    super("Sorveteria Blue                           -  Gabrielle de Souza");
    
    Container tela = getContentPane();
    tela.setLayout(null);
    
    Icon imagem = new ImageIcon ("C:\\Users\\gabik\\Pictures\\sorveteazulmttop.jpg");
    JLabel label10 = new JLabel (imagem);
    label10.setBounds(0, 10, 400, 200);
   
    JLabel label3 = new JLabel("Tipo de sorvete");
    label3.setBounds(0,100,200,250);
    
    JLabel label4 = new JLabel("Quantidade");
    label4.setBounds(130, 100, 200, 250);
    
    JLabel label6 = new JLabel("Preço Unitario");
    label6.setBounds(250, 100, 200, 250);
     
    JLabel label8 = new JLabel("Picolé de frutas ");
    label8.setBounds(0, 120, 200, 300);
    
    caixaTexto1 = new JTextField(" ");
    caixaTexto1.setBounds(130, 255, 50, 30);
    
    caixaTexto2 = new JTextField("   ");
    caixaTexto2.setBounds(250, 255, 50, 30);
    
    JLabel label13 = new JLabel("Chocolate/fruta");
    label13.setBounds(0, 45,500, 550);
    
    caixaTexto3 = new JTextField(" ");
    caixaTexto3.setBounds(130, 310, 50, 30);
      
    caixaTexto4 = new JTextField("    ");
    caixaTexto4.setBounds(250, 310, 50, 30);
   
    JLabel label17 = new JLabel("Bola");
    label17.setBounds(0, 95,500, 550);
    
    caixaTexto5 =  new JTextField("  ");
    caixaTexto5.setBounds(130, 360, 50, 30);
    
    caixaTexto6 = new JTextField(" ");
    caixaTexto6.setBounds(250, 360, 50, 30);
    
    JLabel label21 = new JLabel("Pote de 2 litros");
    label21.setBounds(0, 150, 500, 550);
    
    caixaTexto7 = new JTextField("  ");
    caixaTexto7.setBounds(130, 410, 50, 30);
   
    caixaTexto8 = new JTextField(" ");
    caixaTexto8.setBounds(250, 410, 50, 30);
    
    JLabel label25 = new JLabel("Total: ");
    label25.setBounds(0, 210, 500, 550);
    
    caixaTexto9 = new JTextField("        ");
    caixaTexto9.setBounds(130, 470, 50, 30);
    
    
    botaoCalcular.setBounds(10,600,200,50);
    botaoLimpar.setBounds(350,600,200,50);
    //Atalhos no botão 
    botaoCalcular.setMnemonic(KeyEvent.VK_B);
    botaoLimpar.setMnemonic(KeyEvent.VK_A);

    
    tela.add(botaoLimpar); 
    tela.add(label10);
    tela.add(label3);
    tela.add(label4);
    tela.add(label6);
    tela.add(label8);
    tela.add(caixaTexto1);
    tela.add(caixaTexto2);
    tela.add(label13);
    tela.add(caixaTexto3);
    tela.add(caixaTexto4);
    tela.add(label17);
    tela.add(caixaTexto5);
    tela.add(caixaTexto6);
    tela.add(label21);
    tela.add(caixaTexto7);
    tela.add(caixaTexto8);
    tela.add(label25);
    tela.add(caixaTexto9);
    tela.add(botaoCalcular);
    botaoCalcular.addActionListener(
        new ActionListener() {
         @Override
     public void actionPerformed(ActionEvent ae) {
        try {
        String qtdItemString = caixaTexto1.getText();
        int qtdItem1 = Integer.parseInt(qtdItemString);
                        
        String qtdItemString2 = caixaTexto3.getText(); 
        int qtdItem2 = Integer.parseInt(qtdItemString2);
                        
        String qtdItemString3 = caixaTexto5.getText(); 
        int qtdItem3 = Integer.parseInt(qtdItemString3);
                        
        String qtdItemString4 = caixaTexto7.getText(); 
        int qtdItem4 = Integer.parseInt(qtdItemString4);
                        
        double totalReal = qtdItem1*1.25 + qtdItem2*1.5 + qtdItem3*2 + qtdItem4*15.75;
        String totalString;
                            
        if (qtdItem1>=0 && qtdItem2>=0 && qtdItem3>=0 && qtdItem4>=0) {
        totalString = "R$" + totalReal;
        caixaTexto9.setText(totalString);
      } else {
        JOptionPane.showMessageDialog(null, "Insira valores válidos.", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
          }
       catch(RuntimeException ex) {
          JOptionPane.showMessageDialog(null, "Insira valores válidos.", "Erro!", JOptionPane.ERROR_MESSAGE);
          }}
                });
        
     botaoLimpar.addActionListener(
     new ActionListener() {
       @Override
      public void actionPerformed(ActionEvent ae) {
        caixaTexto1.setText("");
        caixaTexto3.setText("");
        caixaTexto5.setText("");
        caixaTexto7.setText("");
        caixaTexto9.setText("");
                    }
                }
        );
 
  
    
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(570, 700);
    this.setVisible(true);
     
}
public void Arquivo(ActionEvent e) {
     if(e.getSource() == botaoCalcular){
     
     
     //Dps que calcular, ele o programa grava os dados em um txt
     try {
       FileWriter arquivo = new FileWriter("C:\\Users\\gabik\\Desktop\\sorveteriaBlue.txt", true);
       BufferedWriter b1 = new BufferedWriter(arquivo);
       
       b1.write("Total: " + caixaTexto9.getText());
       b1.newLine();
       b1.close();

       JOptionPane.showMessageDialog(null,"Gravação do arquivo realizada com sucesso!!");
     }   
       catch (IOException ex) {
       JOptionPane.showMessageDialog(null, "Erro na gravação do arquivo!!");
        }
     
     }

    }

}
