//crir um metodo para centalizar uma string
//método não retorna argumneto

//criando a classe
class ExemploTitulo{
	
	//criando o método para centralizar
	//método não retorna valor
	// não necessita de um objeto para ser executado
	//o argumento não poderá ser alterado
	
	static void titulo(final String texto){
		int brancos = (80-texto.length())/2;
		for (int i = 1; i<=brancos; i++)
		System.out.print (' ');
		System.out.print(texto);
		
	}
	//metodo pirncipal
	public static void main (String agrs[]){
		try
		{
			titulo("TO CANSADA \n");
		
		}
		catch (Exception e)
		{
			titulo("Exemplo de Título Centralizado");
		}
		
		}
		
}		
		
	

