import javax.swing.JOptionPane;
public class Questao1 {    
    public static void main(String args[]){        
        int impar = 1;
        JOptionPane.showMessageDialog(null, "Numeros Impares: ");
        while(impar <= 20){
            if(impar%2 != 0){
                JOptionPane.showMessageDialog(null, +impar);
            }
            impar++;
        	}
    }
}
       
        
