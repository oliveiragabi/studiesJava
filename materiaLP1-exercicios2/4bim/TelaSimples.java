package sorveteriablue;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;

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

public TelaSimples(){
    
    super("Sorveteria Blue                           -  Gabrielle de Souza");
    
    Container tela = getContentPane();
    tela.setLayout(new FlowLayout(FlowLayout.LEFT));
    
    Icon imagem = new ImageIcon ("C:\\Users\\gabik\\Pictures\\sorveteazulmttop.jpg");
    JLabel label10 = new JLabel (imagem);
    
    JLabel label0 =  new JLabel ("                                                  ");
    JLabel label1 = new JLabel("             ");
    JLabel label2 = new JLabel("          ");
    JLabel label3 = new JLabel("Tipo de sorvete       ");
    JLabel label4 = new JLabel("Quantidade              ");
    JLabel label5 = new JLabel("");
    JLabel label6 = new JLabel("Preço Unitario                      ");
    JLabel label7 = new JLabel("  ");
    JLabel label8 = new JLabel("Picolé de frutas      ");
    caixaTexto1 = new JTextField("1     ");
    JLabel label9 = new JLabel("                           ");
    caixaTexto2 = new JTextField("1.26   ");
    JLabel label11 = new JLabel("                ");
    JLabel label12 = new JLabel("             ");
    JLabel label13 = new JLabel("Chocolate/fruta       ");
    caixaTexto3 = new JTextField("2     ");
    JLabel label14 = new JLabel("                           ");
    caixaTexto4 = new JTextField("1.50    ");
    JLabel label15 = new JLabel("                           ");
    JLabel label16 = new JLabel("                           ");
    JLabel label17 = new JLabel("Bola                           ");
    caixaTexto5 = new JTextField("         ");
    JLabel label18 = new JLabel("                          ");
    caixaTexto6 = new JTextField("2.00      ");
    JLabel label19 = new JLabel("                           ");
    JLabel label20 = new JLabel("                           ");
    JLabel label21 = new JLabel("Pote de 2 litros       ");
    caixaTexto7 = new JTextField("         ");
    JLabel label22 = new JLabel("                          ");
    caixaTexto8 = new JTextField("15.75");
    JLabel label23 = new JLabel("                                                        ");
    JLabel label24 = new JLabel("                                                        ");
    JLabel label25 = new JLabel("Total: ");
    caixaTexto9 = new JTextField("        ");

    
    tela.add(label10);
    //tela.add(label0);
    tela.add(label1);
    tela.add(label2);
    tela.add(label3);
    tela.add(label4);
    tela.add(label5);
    tela.add(label6);
    tela.add(label7);
    tela.add(label8);
    tela.add(caixaTexto1);
    tela.add(label9);
    tela.add(caixaTexto2);
    tela.add(label11);
    tela.add(label12);
    tela.add(label13);
    tela.add(caixaTexto3);
    tela.add(label14);
    tela.add(caixaTexto4);
    tela.add(label15);
    tela.add(label16);
    tela.add(label17);
    tela.add(caixaTexto5);
    tela.add(label18);
    tela.add(caixaTexto6);
    tela.add(label19);
    tela.add(label20);
    tela.add(label21);
    tela.add(caixaTexto7);
    tela.add(label22);
    tela.add(caixaTexto8);
    tela.add(label23);
    tela.add(label24);
    tela.add(label25);
    tela.add(caixaTexto9);
  
    
    
    
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(470, 500);
    this.setVisible(true);
    
}    
}
