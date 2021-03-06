//criando a classe
public class Gestacao {
	
	//atributos
	String nome;
	float peso;
	float altura;
	
	//criando os métodos
	Gestacao()
	{
		nome = "Gabrielle Souza";
		peso = 48.5f;
		altura = 1.54f;
			
	}
	
	Gestacao(String n, float p, float a){
		
		nome = n;
		peso = p;
		altura = a;
		
	}
	
	float imc(){
		
		float IMC = peso / (altura*altura);
		return (IMC);
	}
}