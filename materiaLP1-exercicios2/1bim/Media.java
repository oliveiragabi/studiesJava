//pgm calcula a media  de uma aluno

//importando a classe
import javax.swing.JOptionPane;

//criando a classe
public class Media {
	
	//método principal
	public static void main(String args[]){
		
		//criando as variáveis
		float primeiraNota = 0.0f;
		float segundaNota = 0.0f;
		float media = 0.0f;
		String primeiroValor;
		String segundoValor;
		
			
		//solicitar os valores para o usuário
		primeiroValor = JOptionPane.showInputDialog(
			"Entre com a primeira nota");
		segundoValor = JOptionPane.showInputDialog(
			"Entre com a segunda nota");
		         
	    //convertendo texto para número
	    primeiraNota = Float.parseFloat(primeiroValor);
		segundaNota = Float.parseFloat(segundoValor);
		
		//calculando
		media = (primeiraNota+segundaNota)/2; 
		
		//exibir o resultado
		JOptionPane.showMessageDialog(null, 
		    "A média é " + media); 
		
		
	}
	
	
}
