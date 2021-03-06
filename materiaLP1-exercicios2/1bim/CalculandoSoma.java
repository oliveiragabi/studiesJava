//importando a classe JOptionPane
import javax.swing.JOptionPane;

//criar a classe
public class CalculandoSoma {
	
	//método principal
	public static void main(String args[]){
		
		//criando as variáveis
		int valor1 = 0;
		int valor2 = 0;
		int resultado = 0;
		String primeiroValor;
		String segundoValor;
		
			
		//solicitar os valores para o usuário
		primeiroValor = JOptionPane.showInputDialog("Entre com primeiro valor");
		segundoValor = JOptionPane.showInputDialog("Entre com segundo valor");
		         
	    //convertendo texto para número
	    valor1 = Integer.parseInt(primeiroValor);	         
		valor2 = Integer.parseInt(segundoValor);
		
		//calculando
		resultado = valor1 + valor2;
		
		//exibir o resultado
		JOptionPane.showMessageDialog(null, "A soma é " + resultado); 
		
		
	}
	
	
}