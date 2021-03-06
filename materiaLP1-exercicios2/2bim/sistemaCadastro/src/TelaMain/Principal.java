package TelaMain;
import java.text.ParseException;
import Dados.EstruturaDados;
import Tela.CadastroTela;
import Negocio.RegrasNegocio;
import Dados.Arquivo;

public class Principal {
     public static void main(String[] args) throws ParseException {
        String opcaoMenu =  "";
        CadastroTela telas = new CadastroTela();       
    
        do {                           
           
    	    opcaoMenu =  telas.telaMenu(); 
         
            if(opcaoMenu.equals("2"))
    	   {
    		
    		EstruturaDados dados = Arquivo.acessaDados();  
    	        telas.mostrarTela(dados);  
    	   } 
           else{            
    	
            if(opcaoMenu.equals("1"))
            {
    		telas.EntradaDados();      	 
                RegrasNegocio regras = new RegrasNegocio();
	
                String msgRegra = regras.verificaDados(telas.getIdade()); 
                
                if (msgRegra.equals("")) 
                {{
                    String registro =    
                    telas.getNome()   +    
                    ";"                      +   
                    telas.getId()    +   
                    ";"                      + 
                    telas.getIdade();   
                                                                  
                    String arq = "C:\\Users\\gabik\\Documents\\IFSP\\LP1 - Aulas\\2bim\\sistemaCadastro.txt";  
                              
                    Arquivo.Write(arq,registro);     
                    telas.msgTela("Cadastro concluído com sucesso");
    		} 
               
    		} else {
                   
                    if (opcaoMenu.equals("3")) 
                    {
                            telas.msgTela("Sistema encerrado");
                    }
                    else {
    			    telas.msgTela("Selecione um opção de menu válida");
    		         }	  
    		   }	  
    	   }
        }

        }     	while (!opcaoMenu.equals("3")) ;  

     } 
}

