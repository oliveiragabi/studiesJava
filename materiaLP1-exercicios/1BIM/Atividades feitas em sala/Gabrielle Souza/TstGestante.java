//qualificadores public, classe amigavel
//criando a classe

class TstGestante{
	
	public static void main(String args []) {
		
		//declarar e instanciar um objeto da classe Gestacao
		//classe 					//método construtor
		Gestacao objGestacao = new Gestacao("Paulo", 48.5f, 1.75f);
		
		/*
		//inserindo os valores
		objGestacao.nome = "Sara";
		objGestacao.peso = 76.5f;
		objGestacao.altura = 1.76f;
		*/
		
		//exibir resultado
		System.out.println(objGestacao.nome + "\nApresenta imc = " +objGestacao.imc());
	}
}