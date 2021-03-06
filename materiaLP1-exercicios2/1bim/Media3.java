//pgm calcula a media  de uma aluno que estuda semestralmente
//caso a media>=6 - aprovado
//caso a media<6 - reprovado
//quantidade faltas for menor que 23 - aprovado


//importando a classe
import javax.swing.JOptionPane;

//criando a classe
public class Media3 {
	
	//método principal
	public static void main(String args[]){
		
		//criando as variáveis
		float primeiraNota = 0.0f;
		float segundaNota = 0.0f;
		float media = 0.0f;
		int faltas = 0;
		String primeiroValor;
		String segundoValor;
		String terceiroValor;
		
			
		//solicitar os valores para o usuário
		primeiroValor = JOptionPane.showInputDialog("Entre com a primeira nota");
		segundoValor = JOptionPane.showInputDialog("Entre com a segunda nota");
		terceiroValor = JOptionPane.showInputDialog("Entre com a quantidade de faltas");
		         
	    //convertendo texto para número
	    primeiraNota = Float.parseFloat(primeiroValor);
		segundaNota = Float.parseFloat(segundoValor);
		
		//calculando
		media = (primeiraNota+segundaNota)/2; 
		
		//condição
		//Atividade: reestruturar a condição 
		if (faltas<23)
		    if (media >=7)
				//exibir o resultado aprovado
		     JOptionPane.showMessageDialog(null, "Aprovado "); 
		          else
		      //exibir o resultado reprovado
		     JOptionPane.showMessageDialog(null, "Reprovado "); 
		
	}
	
	
}
