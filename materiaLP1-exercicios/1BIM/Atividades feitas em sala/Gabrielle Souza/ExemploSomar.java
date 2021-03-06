//proposta: método que retorna argumentos
//criando a classe

class ExemploSomar{
	
	//criando método somar
	public static int somar(int numero1, int numero2){
		
		return(numero1+numero2);
	}
	
	//método principal
	public static void main (String args[]){
		
		//declarar e iniciar duas variaveis
		int a =15;
		int b = 20;
		
		//exibindo o resultado
		System.out.println(a + "+" + b + "=" + somar(a,b) );
	}
}