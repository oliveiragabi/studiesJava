import  javax.swing.JOptionPane;

public class ex3 {
	public static void main (String args[]){
	int num = 0;
	int numf = 0;
	
	JOptionPane.showInputDialog("Entre com um número: " +num);
	
		for (int num = 0; num >0; num++){
			
			for (int numf = 0; numf<=10; numf++){
				JOptionPane.showMessageDialog (num+" x "+ numf + " = " + num*numf);
			}
		}
	}

    
}