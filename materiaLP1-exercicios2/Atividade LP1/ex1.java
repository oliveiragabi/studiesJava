import javax.swing.JOptionPane;

public class ex1 {    

    public static void main(String args[]){        
        int num = 1;
        
        JOptionPane.showMessageDialog(null, "Programa exibe numeros impares: ");
       
        for(num=0; num<=20; num++){
        	if(num%2 != 0)
            JOptionPane.showMessageDialog(null,"O numero impar é:\t " +num);
           
        }
    }
     
 }